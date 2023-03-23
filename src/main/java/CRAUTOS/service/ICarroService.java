/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Carro;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
/**
 *
 * @author roleongu
 */
public interface ICarroService {
    public List<Carro> getAllCarro();
    public Carro getCarroById (long id);
    public void saveCarro(Carro carro);
    public void delete (long id);
}
