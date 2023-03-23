/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.repository;

import com.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author roleongu
 */
@Repository
/*Clase tiene que cambiar a interface*/

public interface paisrepository extends CrudRepository<Pais,Long>{
    /*Crud repository se esconde y no se muestra nunca lo que hace en si */
}
