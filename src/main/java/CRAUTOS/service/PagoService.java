/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Pago;
import CRAUTOS.repository.PagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Kenneth
 */

@Service
public class PagoService implements IPagoService{

@Autowired
    private PagoRepository PagoRepository;
    
    @Override
    public List<Pago> getAllPago() {
        return (List<Pago>)PagoRepository.findAll();
    }
    
    @Override
    public Pago getPagoById(long id) {
        return PagoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savePago(Pago pago) {
        PagoRepository.save(pago);
    }
    
    @Override
    public void delete(long id) {
        PagoRepository.deleteById(id);
    }

   
}
    
