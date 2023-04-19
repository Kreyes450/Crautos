/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Publicidad;
import java.util.List;



/**
 *
 * @author Kenneth
 */
public interface IPublicidadService {
    public List<Publicidad> getAllPublicidad();
    public Publicidad getPublicidadById (long id);
    public void savePublicidad(Publicidad publicidad);
    public void delete (long id);
}
