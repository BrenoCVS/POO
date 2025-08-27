/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import DTO.SomaDTO;
import DAO.SomaDAO;


/**
 *
 * @author brenocvs
 */
public class SomaCTR {
    SomaDAO somaDAO = new SomaDAO();
    
    public void somar(SomaDTO somaDTO){
        somaDAO.conta(somaDTO);
    }
    
    public int mostraSoma(){
        return somaDAO.mostrar();
    }
}
