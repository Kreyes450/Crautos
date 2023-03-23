/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

/**
 *
 * @author roleongu
 */

import com.tienda.entity.Pais;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public interface IPaisService {
    /*devolver informacion al frontend*/
    public List<Pais> listCountry();
}
