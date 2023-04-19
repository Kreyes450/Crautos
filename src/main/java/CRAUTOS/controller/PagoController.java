/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Pago;
import CRAUTOS.service.IPagoService;
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
public class PagoController {
  
    @Autowired
    private IPagoService PagoService;
    
//    @Autowired
//    private IUsuarioService usuarioService;
    
    @Autowired
    private IPublicidadService publicidadService;
 
   //@Autowired

    
    @GetMapping("/pago")
    public String index(Model model) {
        List<Pago> listaPago = PagoService.getAllPago();
        model.addAttribute("titulo", "Tabla pago");
        model.addAttribute("pago", listaPago);
        return "pago";
    }
 
    @GetMapping("/pagoNN")
    public String crearPago(Model model) {
       //List<Pais> listaPaises = paisService.listCountry();
       model.addAttribute("pago", new Pago());
       //model.addAttribute("paises", listaPaises);
       return"crearPago";
    }
    
    @GetMapping("/delete/{idM}")
    public String eliminarPago(@PathVariable("pago_id") Long idPago) {
        PagoService.delete(idPago);
        return"redirect:/pago";
    }
    
    @PostMapping("/saveB")
    public String guardarPago(@ModelAttribute Pago pago) {
        PagoService.savePago(pago);
        return"redirect:/pago";  
  }

    @GetMapping("editPago/{id}")
    public String editarPago(@PathVariable("pago_id") Long idPago, Model model) {
            Pago pago = PagoService.getPagoById(idPago);
            //List<Pais> listaPaises = paisService.listCountry();
            model.addAttribute("Pago", pago);
            //model.addAttribute("paises", listaPaises);
            return "crearpago";   
}

}

