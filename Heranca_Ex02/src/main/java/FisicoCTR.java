/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String imprimirDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.imprimirDadosFisico(fisicoDTO);
    }
}
