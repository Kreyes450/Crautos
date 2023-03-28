/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Tipo_Usuario;
import CRAUTOS.repository.Tipo_UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tipo_UsuarioService implements ITipo_UsuarioService {

    @Autowired //para unir ambos objetos/instancias. Ese autowired crea el puente entre el Repository y el Service
    private Tipo_UsuarioRepository tipo_usuarioRepository;

    @Override
    public List<Tipo_Usuario> listTipoUsuario() {
        return (List<Tipo_Usuario>) tipo_usuarioRepository.findAll();
    }

}
