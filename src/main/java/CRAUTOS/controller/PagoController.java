/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.controller;

import CRAUTOS.entity.Pago;
import CRAUTOS.entity.Publicidad;
import CRAUTOS.entity.Usuario;
import CRAUTOS.service.IPagoService;
import CRAUTOS.service.IPublicidadService;
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
 * @author mathi
 */
@Controller
public class PagoController {
    
    @Autowired
    private IPagoService pagoService;

    @Autowired
    private IUsuarioService usuarioService;
    
    @Autowired
    private IPublicidadService publicidadService;
    
    @GetMapping("/pagoAdmin")
    public String index(Model model) {
        List<Pago> listaPago = pagoService.getAllPagos();
        System.out.println(listaPago);
        model.addAttribute("titulo", "Tabla Pagos");
        model.addAttribute("pago", listaPago);
        return "pagoAdmin";

    }
    
    @GetMapping("/crearPago")
    public String crearPago(Model model) {
        List<Usuario> listaUsuario = usuarioService.getAllUsuario();
        List<Publicidad> listaPublicidad = publicidadService.getAllPublicidad();
        model.addAttribute("pago", new Pago());
        model.addAttribute("usuario", listaUsuario);
        model.addAttribute("publicidad", listaPublicidad);
        return "crearPago";
    }
    
    @GetMapping("deletePago/{idP}")
    public String eliminarPago(@PathVariable("idP") Long pago_id) {
        pagoService.delete(pago_id);
        return "redirect:/pagoAdmin";
    }
    
    @PostMapping("/savePago")
    public String guardarPago(@ModelAttribute Pago pago) {
        pagoService.savePago(pago);
        return "redirect:/home";
    }
}
