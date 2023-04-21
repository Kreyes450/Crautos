/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Noticias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import CRAUTOS.service.INoticiasService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoticiasController {
    
    @Autowired
    private INoticiasService noticiasService;
    
    @GetMapping("/noticias") // aca definimos el endpoint para el html persona. Se triggerea ese mapping 
    //el restful api ejecuta todo mediante requests.
    public String index(Model model) { //el model permite pasarle al frontend la info mediante el addAttribute
        List<Noticias> listaNoticias = noticiasService.getAllNoticias();
        model.addAttribute("titulo", "Tabla Noticias");
        model.addAttribute("noticias", listaNoticias);
        System.out.println(listaNoticias);
        return "noticias";

    }
    
    @GetMapping("/noticiasUser") // aca definimos el endpoint para el html persona. Se triggerea ese mapping 
    //el restful api ejecuta todo mediante requests.
    public String indexU(Model model) { //el model permite pasarle al frontend la info mediante el addAttribute
        List<Noticias> listaNoticias = noticiasService.getAllNoticias();
        model.addAttribute("titulo", "Tabla Noticias");
        model.addAttribute("noticias", listaNoticias);
        System.out.println(listaNoticias);
        return "noticiasUser";

    }

    @GetMapping("/noticiaN")
    public String crearNoticia(Model model) {
        //List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("noticias", new Noticias());
        //model.addAttribute("paises", listaPaises);
        return "crearNoticia";

    }

    @GetMapping("borrarN/{id}")
    public String eliminarNoticia(@PathVariable("id") Long idNoticia) {
        noticiasService.delete(idNoticia);
        return "redirect:/noticias";
    }

    @PostMapping("/saveNoticia")
    public String guardarNoticia(@ModelAttribute Noticias noticia) {
        noticiasService.saveNoticia(noticia);
        return "redirect:/noticias";
    }

    @GetMapping("editNoticia/{id}")
    public String editarNoticia(@PathVariable("id") Long idNoticia, Model model) {
        Noticias noticia = noticiasService.getNoticiaById(idNoticia);
        //List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("noticias", noticia);
        //model.addAttribute("paises", listaPaises);
        return "editarNoticia";
    }
    
}
