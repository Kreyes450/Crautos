/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Comentarios;
import java.util.List;
import org.springframework.stereotype.Service;


@Service


/**
 *
 * @author Kenneth
 */

 public interface IComentariosService {
    public List<Comentarios> getAllComentarios();
    public Comentarios getComentariosById (long id);
    public void saveComentarios(Comentarios comentarios);
    public void delete (long id);
  
  
}

