/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Publicidad;
import CRAUTOS.service.IPublicidadService;
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
public class PublicidadController {
  
    @Autowired
    private IPublicidadService PublicidadService;
 
   //@Autowired

    
    @GetMapping("/publicidad")
    public String index(Model model) {
        List<Publicidad> listaPublicidad = PublicidadService.getAllPublicidad();
        model.addAttribute("titulo", "Tabla publicidad");
        model.addAttribute("publicidad", listaPublicidad);
        return "publicidad";
    }
 
    @GetMapping("/publicidadN")
    public String crearPublicidad(Model model) {
       //List<Pais> listaPaises = paisService.listCountry();
       model.addAttribute("publicidad", new Publicidad());
       //model.addAttribute("paises", listaPaises);
       return"crearPublicidad";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPublicidad(@PathVariable("publicidad_id") Long idPublicidad) {
        PublicidadService.delete(idPublicidad);
        return"redirect:/publicidad";
    }
    
    @PostMapping("/saveV")
    public String guardarPublicidad(@ModelAttribute Publicidad publicidad) {
        PublicidadService.savePublicidad(publicidad);
        return"redirect:/publicidad";  
  }

    @GetMapping("editPublicidad/{id}")
    public String editarPublicidad(@PathVariable("publicidad_id") Long idPublicidad, Model model) {
            Publicidad publicidad = PublicidadService.getPublicidadById(idPublicidad);
            //List<Pais> listaPaises = paisService.listCountry();
            model.addAttribute("Publicidad", publicidad);
            //model.addAttribute("paises", listaPaises);
            return "crearpublicidad";   
}

}