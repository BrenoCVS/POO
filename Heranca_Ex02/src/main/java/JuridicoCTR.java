/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String imprimirDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.imprimirDadosJuridico(juridicoDTO);
    }
            
}
