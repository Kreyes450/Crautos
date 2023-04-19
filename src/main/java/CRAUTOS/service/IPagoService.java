/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRAUTOS.service;

import CRAUTOS.entity.Pago;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public interface IPagoService {
    public List<Pago> getAllPago();
    public Pago getPagoById (long id);
    public void savePago(Pago pago);
    public void delete (long id); 
}
