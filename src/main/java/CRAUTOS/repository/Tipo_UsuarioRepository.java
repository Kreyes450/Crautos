/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.repository;

import CRAUTOS.entity.Tipo_Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface Tipo_UsuarioRepository extends CrudRepository<Tipo_Usuario, Long>{
    
}
