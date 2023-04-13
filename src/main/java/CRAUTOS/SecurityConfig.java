/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS;

import CRAUTOS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 *
 * @author roleongu
 *
 *
 */
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    @Bean

    /*Provedoor de authenticacion. setea password encoder y el userdetailsservice */
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }

    @Bean

    public AuthenticationSuccessHandler appAuthenticationSuccessHandler() {
        return new AppAuthenticationSuccessHandler();
    }

    /*constructor */
    public SecurityConfig(UserService userPrincipalDetailsService) {
        this.userDetailsService = userPrincipalDetailsService;
    }

    @Override

    /*asigna todos nuestros informacion requerida para nuestra auth, */
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }

    /*Este metodo ve los accesos que puede tener una persona segun el role*/
    
    /*Para los Endpoints ventadecarros y login puede ingresar ADMIN solamente, para los endpoint PersonasN persona y login todos pueden ir */
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/usuarios")
                .hasRole("Admin")


                /*persona y login solamente admin*/
                .antMatchers("/comentarios", "/review", "/login")
                /**/
                .hasRole("User")
                /*.hasAnyRole("User", "Admin") este es para multiples roles*/
                
                /*cualquiera con estos otros roles puede ingresar a los de arriba*/
                /*.anyRequest().authenticated() se quita esta parte, se obliga que si o si hay que autenticarse, aunque no hagamos login. Siempre y cuando el endpoint que voy a acceder no ocupe logon*/
                
                
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/home", true).and().logout()
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/");
    }

}
