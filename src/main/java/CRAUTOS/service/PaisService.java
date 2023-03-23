/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import com.tienda.entity.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.repository.paisrepository;

/**
 *
 * @author roleongu
 */
@Service

/*se comporta como servicio*/
 /*cuando se agrega el implements quiere decir que el va a trabajar en ese metodo*/
public class PaisService implements IPaisService {

    @Autowired
    private paisrepository paisRepository;

    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findAll();
    }
}
