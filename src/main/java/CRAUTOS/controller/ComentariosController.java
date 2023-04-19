/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Comentarios;
import CRAUTOS.service.IComentariosService;
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
    private IComentariosService ComentariosService;
 
   //@Autowired

    
    @GetMapping("/comentarios")
    public String index(Model model) {
        List<Comentarios> listaComentarios = ComentariosService.getAllComentarios();
        model.addAttribute("titulo", "Tabla comentarios");
        model.addAttribute("comentarios", listaComentarios);
        return "comentarios";
    }
 
    @GetMapping("/comentarioN")
    public String crearComentarios(Model model) {
       //List<Pais> listaPaises = paisService.listCountry();
       model.addAttribute("comentarios", new Comentarios());
       //model.addAttribute("paises", listaPaises);
       return"crearComentarios";
    }
    
    @GetMapping("/delete/{idC}")
    public String eliminarComentarios(@PathVariable("comentarios_id") Long idComentario) {
        ComentariosService.delete(idComentario);
        return"redirect:/comentarios";
    }
    
    @PostMapping("/saveC")
    public String guardarComentarios(@ModelAttribute Comentarios comentarios) {
        ComentariosService.saveComentarios(comentarios);
        return"redirect:/comentarios";  
  }

    @GetMapping("editComentarios/{id}")
    public String editarComentarios(@PathVariable("comentarios_id") Long idComentario, Model model) {
            Comentarios comentarios = ComentariosService.getComentariosById(idComentario);
            //List<Pais> listaPaises = paisService.listCountry();
            model.addAttribute("Comentarios", comentarios);
            //model.addAttribute("paises", listaPaises);
            return "crearComentarios";   
}


}
