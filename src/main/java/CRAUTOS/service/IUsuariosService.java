/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Usuarios;
import java.util.List;

public interface IUsuariosService {

    public List<Usuarios> getAllUsuarios();

    public Usuarios getUsuarioById(long id);

    public void saveUsuario(Usuarios usuarios);

    public void delete(long id);
}
