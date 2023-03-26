/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Usuarios;
import CRAUTOS.repository.UsuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> getAllUsuarios() {
        return (List<Usuarios>) usuariosRepository.findAll();
    }

    @Override
    public Usuarios getUsuarioById(long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveUsuario(Usuarios usuarios) {
        usuariosRepository.save(usuarios);
    }

    @Override
    public void delete(long id) {
        usuariosRepository.deleteById(id);
    }

}
