/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.tienda.repository.personarepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author roleongu
 */
@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private personarepository personaRepository;

    @Override
    public List<Persona> getAllPersona() {
        return(List<Persona>)personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
       personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
       
    }
    
    
}
