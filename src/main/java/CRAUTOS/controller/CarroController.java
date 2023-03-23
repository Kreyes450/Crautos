/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Carro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import CRAUTOS.service.ICarroService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author roleongu
 */
@Controller
public class CarroController {

    @Autowired
    private ICarroService carroService;

    /*
    @Autowired
    private IPaisService paisService;
     */
    /*@GetMapping("/persona")*/
    @GetMapping("/ventadecarros")
    /*Model nos ayuda con el metodo addAttribute la informacion al frontend*/
    public String index(Model model) {
        List<Carro> listacarros = carroService.getAllCarro();
        model.addAttribute("titulo", "Tabla Carros");
        model.addAttribute("carros", listacarros);
        /*
        return "personas";*/
        return "ventadecarros";
    }

    @GetMapping("/personaN")

    public String crearCarro(Model model) {
        /*
        List<Carro> listaPaises = paisService.listCountry();*/
        model.addAttribute("persona", new Carro());
        /*
        model.addAttribute("paises", listaPaises);
         */
        return "crear";
    }

    /*el arroba es un patron decorador*/
    @GetMapping("/delete/{id}")
    public String eliminarCarro(@PathVariable("Carro_ID") Long idcarro) {
        carroService.delete(idcarro);
        return "redirect:/persona";
    }

    /*Que es el ModelAttribute, Model es un objeto, el @Modelattribute es un patron decorador*/
 /*cuando lo agregamos como argumento dentro de un metodo, es como deberia retornar la informacion el postmapping, */
 /*El objeto model es una interfaz que crear pares de key value, donde el key va a ser "persona", value es lo siguiente*/
 /**/
    @PostMapping("/save")
    public String guardarCarro(@ModelAttribute Carro carro) {
        carroService.saveCarro(carro);
        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarCarro(@PathVariable("Carro_ID") Long idcarro, Model model) {
        Carro carro = carroService.getCarroById(idcarro);
        /*
        List<Pais> listaPaises = paisService.listCountry();*/
        model.addAttribute("persona", carro);/*
        model.addAttribute("paises", listaPaises);*/
        return "crear";
    }

}
