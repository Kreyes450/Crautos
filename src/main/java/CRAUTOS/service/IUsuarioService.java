/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Usuario;
import java.util.List;
import org.springframework.stereotype.Service;
@Service

public interface IUsuarioService {
    public List<Usuario> getAllUsuario();
    public Usuario getUsuarioById (long iduser);
    public void saveUsuario(Usuario usuario);
    public void delete (long iduser);
    //si hay errores puede estar aqui
    public Usuario findByApellido(String apellido); //findbyapellido
}
