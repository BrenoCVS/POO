/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import VIEW.IntervaloVIEW;
import DTO.IntervaloDTO;
import DAO.IntervaloDAO;

public class IntervaloCTR {
    
    IntervaloVIEW intervaloVIEW = new IntervaloVIEW();
    IntervaloDTO intervaloDTO = new IntervaloDTO();
    IntervaloDAO intervaloDAO = new IntervaloDAO();
    
    public String ordem(IntervaloDTO intervaloDTO){
        return intervaloDAO.ordenar(intervaloDTO);
    }
}
