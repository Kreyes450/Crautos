/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Comentarios;
import CRAUTOS.entity.Usuario;
import CRAUTOS.service.IComentariosService;
import CRAUTOS.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kenneth
 */
@Controller
public class ComentariosController {

    @Autowired
    private IComentariosService comentariosService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/comentariosAdm")
    public String index(Model model) {
        List<Comentarios> listaComentarios = comentariosService.getAllComentarios();
        model.addAttribute("titulo", "Tabla comentarios");
        model.addAttribute("comentarios", listaComentarios);
        return "comentariosAdm";
    }

    @GetMapping("/comentariosUser")
    public String indexC(Model model) {
        List<Comentarios> listaComentarios = comentariosService.getAllComentarios();
        model.addAttribute("titulo", "Tabla comentarios");
        model.addAttribute("comentarios", listaComentarios);
        return "comentariosUser";
    }

    @GetMapping("/comentarioN")
    public String crearComentarios(Model model) {
        List<Usuario> listaUsuario = usuarioService.getAllUsuario();
        model.addAttribute("comentarios", new Comentarios());
        model.addAttribute("usuarios", listaUsuario);
        return "crearComentario";
    }

    @GetMapping("/delete/{idC}")
    public String eliminarComentarios(@PathVariable("comentarios_id") Long idComentario) {
        comentariosService.delete(idComentario);
        return "redirect:/comentariosAdm";
    }

    @PostMapping("/saveComment")
    public String guardarComentarios(@ModelAttribute Comentarios comentarios) {
        comentariosService.saveComentarios(comentarios);
        return "redirect:/comentariosUser";
    }

    @GetMapping("editComentarios/{id}")
    public String editarComentarios(@PathVariable("comentarios_id") Long idComentario, Model model) {
        Comentarios comentarios = comentariosService.getComentariosById(idComentario);
        List<Usuario> listaUsuario = usuarioService.getAllUsuario();
        model.addAttribute("comentarios", comentarios);
        model.addAttribute("usuarios", listaUsuario);
        return "crearComentarios";
    }

}
