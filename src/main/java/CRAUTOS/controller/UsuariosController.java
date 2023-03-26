/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import CRAUTOS.service.IUsuariosService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuariosController {
    
    @Autowired
    private IUsuariosService usuariosService;
    
    @GetMapping("/usuarios") // aca definimos el endpoint para el html persona. Se triggerea ese mapping 
    //el restful api ejecuta todo mediante requests.
    public String index(Model model) { //el model permite pasarle al frontend la info mediante el addAttribute
        List<Usuarios> listaUsuarios = usuariosService.getAllUsuarios();
        model.addAttribute("titulo", "Tabla Usuarios");
        model.addAttribute("noticias", listaUsuarios);
        return "usuarios";

    }

    @GetMapping("/usuarioN")
    public String crearCuenta(Model model) {
        //List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("usuarios", new Usuarios());
        //model.addAttribute("paises", listaPaises);
        return "crearCuenta";
        //importante revisar los endpoints para ver que todo este correcto. 
    }

    @GetMapping("delete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long idUsuario) {
        usuariosService.delete(idUsuario);
        return "redirect:/crearCuenta";
        //redireccionar al home o crear cuenta...?
    }

    @PostMapping("/save")
    public String guardarUsuario(@ModelAttribute Usuarios usuario) {
        usuariosService.saveUsuario(usuario);
        return "redirect:/crearCuenta";
        //hay que redireccionar al login. 
    }

    @GetMapping("editNoticia/{id}")
    public String editarUsuario(@PathVariable("id") Long idUsuario, Model model) {
        Usuarios usuario = usuariosService.getUsuarioById(idUsuario);
        //List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("noticias", usuario);
        //model.addAttribute("paises", listaPaises);
        return "editarUsuario";
    }
}
