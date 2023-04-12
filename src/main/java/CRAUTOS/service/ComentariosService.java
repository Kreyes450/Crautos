/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Comentarios;
import CRAUTOS.repository.ComentariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kenneth
 */
@Service
public class ComentariosService implements IComentariosService{
  
 @Autowired
    private ComentariosRepository ComentariosRepository;
    
    @Override
    public List<Comentarios> getAllComentarios() {
        return (List<Comentarios>)ComentariosRepository.findAll();
    }
    
    @Override
    public Comentarios getComentariosById(long id) {
        return ComentariosRepository.findById(id).orElse(null);
    }
    
    @Override
    public void saveComentarios(Comentarios comentarios) {
        ComentariosRepository.save(comentarios);
    }
    
    @Override
    public void delete(long id) {
        ComentariosRepository.deleteById(id);
    }

   
}
    
    
    

