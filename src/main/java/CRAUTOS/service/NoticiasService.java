/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Noticias;
import CRAUTOS.repository.NoticiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiasService implements INoticiasService{

    @Autowired
    private NoticiasRepository noticiasRepository;
    
    @Override
    public List<Noticias> getAllNoticias() {
        return (List<Noticias>)noticiasRepository.findAll();
    }

    @Override
    public Noticias getNoticiaById(long id) {
        return noticiasRepository.findById(id).orElse(null);
    }

    @Override
    public void saveNoticia(Noticias noticias) {
        noticiasRepository.save(noticias);
    }

    @Override
    public void delete(long id) {
        noticiasRepository.deleteById(id);
    }
    
}
