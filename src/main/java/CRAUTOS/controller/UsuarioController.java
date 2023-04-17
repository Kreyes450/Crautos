/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Usuario;
import CRAUTOS.entity.Tipo_Usuario;
import CRAUTOS.service.IUsuarioService;
import CRAUTOS.service.ITipo_UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    
    
    
    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private ITipo_UsuarioService tipo_usuarioService;
    
    @GetMapping("/usuariosA") // aca definimos el endpoint para el html persona. Se triggerea ese mapping 
    //el restful api ejecuta todo mediante requests.
    public String index(Model model) { //el model permite pasarle al frontend la info mediante el addAttribute
        List<Usuario> listaUsuario = usuarioService.getAllUsuario();
        System.out.println(listaUsuario);
        model.addAttribute("titulo", "Tabla Usuarios");
        model.addAttribute("usuario", listaUsuario);
        return "usuariosA";

    }

    @GetMapping("/usuarioN")
    public String crearUsuario(Model model) {
        List<Tipo_Usuario> listaTipo_Usuario = tipo_usuarioService.listTipoUsuario();
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("tipo_usuario", listaTipo_Usuario);
        return "crearUsuario";

    }
    
    @GetMapping("/crearCuenta")
    public String crearCuenta(Model model) {
        List<Tipo_Usuario> listaTipo_Usuario = tipo_usuarioService.listTipoUsuario();
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("tipo_usuario", listaTipo_Usuario);
        return "crearCuenta";

    }

    @GetMapping("deleteUser/{iduser}")
    public String eliminarUsuario(@PathVariable("iduser") Long usuario_id) {
        usuarioService.delete(usuario_id);
        return "redirect:/usuariosA";
    }

    @PostMapping("/saveUser")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "redirect:/usuariosA";
    }
    
    @PostMapping("/saveCuenta")
    public String guardarCuenta(@ModelAttribute Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("editUser/{iduser}")
    public String editarUsuario(@PathVariable("iduser") Long usuario_id, Model model) {
        Usuario usuario = usuarioService.getUsuarioById(usuario_id);
        List<Tipo_Usuario> listaTipo_Usuario = tipo_usuarioService.listTipoUsuario();
        model.addAttribute("usuario", usuario);
        model.addAttribute("tipo_usuario", listaTipo_Usuario);
        return "editarUsuario";
    }
}
