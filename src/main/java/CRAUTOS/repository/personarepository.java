/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.repository;

/**
 *
 * @author roleongu
 */

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author roleongu
 */
@Repository
/*Clase tiene que cambiar a interface*/

/*<Nombre,Apellido1,Apellido2,Telefono,Email,Long>*/

public interface personarepository extends CrudRepository<Persona,Long>{
    
}
