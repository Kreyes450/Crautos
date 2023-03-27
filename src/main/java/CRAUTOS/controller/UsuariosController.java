/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Tipo_Usuario;
import CRAUTOS.entity.Usuarios;
import CRAUTOS.service.ITipo_UsuarioService;
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
    
    @Autowired
    private ITipo_UsuarioService tipo_usuariosService;
    
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
        List<Tipo_Usuario> listaTipo_Usuario = tipo_usuariosService.listTipo_Usuario();
        model.addAttribute("usuarios", new Usuarios());
        model.addAttribute("tipo_usuario", listaTipo_Usuario);
        return "crearCuenta";
        //importante revisar los endpoints para ver que todo este correcto. 
    }

    @GetMapping("delete/{iduser}")
    public String eliminarUsuario(@PathVariable("iduser") Long idUsuario) {
        usuariosService.delete(idUsuario);
        return "redirect:/crearCuenta";
        //redireccionar al home o crear cuenta...?
    }

    @PostMapping("/saveUser")
    public String guardarUsuario(@ModelAttribute Usuarios usuario) {
        usuariosService.saveUsuario(usuario);
        return "redirect:/usuarios";
        //hay que redireccionar al login. 
    }

    @GetMapping("editUsuario/{iduser}")
    public String editarUsuario(@PathVariable("iduser") Long idUsuario, Model model) {
        Usuarios usuario = usuariosService.getUsuarioById(idUsuario);
        List<Tipo_Usuario> listaTipo_Usuario = tipo_usuariosService.listTipo_Usuario();
        model.addAttribute("noticias", usuario);
        model.addAttribute("tipo_usuario", listaTipo_Usuario);
        return "crearCuenta";
    }
}
