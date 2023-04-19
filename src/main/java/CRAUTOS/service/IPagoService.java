/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Pago;
import java.util.List;

/**
 *
 * @author mathi
 */
public interface IPagoService {
    
    public List<Pago> getAllPagos();

    public Pago getPagoById(long id);

    public void savePago(Pago pago);

    public void delete(long id);
}
