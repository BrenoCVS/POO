/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import DAO.AlturaDAO;
import DTO.AlturaDTO;

public class AlturaCTR {
    AlturaDAO alturaDAO = new AlturaDAO();
    
    public void calcular(AlturaDTO alturaDTO){
        alturaDAO.verificar(alturaDTO);
    }
    
    public String mostra(){
        return alturaDAO.mostrar();
    }
}
