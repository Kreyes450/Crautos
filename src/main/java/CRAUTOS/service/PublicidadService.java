/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Publicidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CRAUTOS.repository.PublicidadRepository;

/**
 *
 * @author Kenneth
 */
@Service
public class PublicidadService implements IPublicidadService{

@Autowired
    private PublicidadRepository PublicidadRepository;
    
    @Override
    public List<Publicidad> getAllPublicidad() {
        return (List<Publicidad>)PublicidadRepository.findAll();
    }
    
    @Override
    public Publicidad getPublicidadById(long id) {
        return PublicidadRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savePublicidad(Publicidad publicidad) {
        PublicidadRepository.save(publicidad);
    }
    
    @Override
    public void delete(long id) {
        PublicidadRepository.deleteById(id);
    }

   
}
    
