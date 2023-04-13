/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author roleongu
 */
public class UserPrincipal implements UserDetails {

    private Usuario user;

    public UserPrincipal(Usuario user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        /*Esta lista de grantedauthority es el return authorities*/
        List<GrantedAuthority> authorities = new ArrayList<>();
        //extract list of permissions (name)
        /*por cada permiso que encuentro en esta list lo agrego a la lista de authorities*/
        this.user.getPermissionList().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });
        // extract list of roles (ROLE_name)
        /*por cada roles que encuentro en esta list lo agrego a la lista de authorities*/
        this.user.getRoleList().forEach(r -> {
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+ r);
            authorities.add(authority);
        });
        return authorities;
    }
    @Override 
    
    public String getPassword(){
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getNombre();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.getActive() == 1;
    }
}
