/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Moto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import CRAUTOS.repository.motorepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author roleongu
 */
@Service
public class MotoService implements IMotoService {

    @Autowired
    private motorepository motoRepository;

    
    @Override
    public List<Moto> getAllMoto() {
        return(List<Moto>)motoRepository.findAll();
    }

    @Override
    public Moto getMotoById(long id) {
        return motoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMoto(Moto moto) {
       motoRepository.save(moto);
    }

    @Override
    public void delete(long id) {
        motoRepository.deleteById(id);
       
    }

}
