/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Moto;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
/**
 *
 * @author roleongu
 */
public interface IMotoService {
    public List<Moto> getAllMoto();
    public Moto getMotoById (long id);
    public void saveMoto(Moto moto);
    public void delete (long id);


}
