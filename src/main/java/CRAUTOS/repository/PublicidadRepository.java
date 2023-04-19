/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.repository;

import CRAUTOS.entity.Publicidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;





/**
 *
 * @author Kenneth
 */
@Repository
public interface PublicidadRepository extends CrudRepository<Publicidad,Long> {

}

