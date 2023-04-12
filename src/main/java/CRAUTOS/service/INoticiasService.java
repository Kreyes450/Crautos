/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Noticias;
import java.util.List;

public interface INoticiasService {
    public List<Noticias> getAllNoticias();

    public Noticias getNoticiaById(long id);

    public void saveNoticia(Noticias noticias);

    public void delete(long id);
}
