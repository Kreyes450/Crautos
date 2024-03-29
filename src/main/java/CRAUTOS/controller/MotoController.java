/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Moto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import CRAUTOS.service.IMotoService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author roleongu
 */
@Controller
public class MotoController {

    @Autowired
    private IMotoService motoService;


    /*
    @Autowired
    private IPaisService paisService;
     */
 /*@GetMapping("/persona")*/
    @GetMapping("/ventademotos")
    /*Model nos ayuda con el metodo addAttribute la informacion al frontend*/
    public String index(Model model) {
        List<Moto> listamotos = motoService.getAllMoto();
        model.addAttribute("titulo", "Tabla Motos");
        model.addAttribute("motos", listamotos);

        return "ventademotos";
    }

    /*Cambiar de aqui para abajo*/
 /**/
    

}
