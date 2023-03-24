/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Carro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import CRAUTOS.repository.carrorepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author roleongu
 */
@Service
public class CarroService implements ICarroService {
    @Autowired
    private carrorepository carroRepository;

    @Override
    public List<Carro> getAllCarro() {
        return(List<Carro>)carroRepository.findAll();
    }

    @Override
    public Carro getCarroById(long id) {
        return carroRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCarro(Carro carro) {
       carroRepository.save(carro);
    }

    @Override
    public void delete(long id) {
        carroRepository.deleteById(id);
       
    }

    @Override
    public List<Carro> getAllCarros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
