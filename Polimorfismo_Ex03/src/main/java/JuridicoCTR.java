/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class JuridicoCTR {
    JuridicoDAO jdao = new JuridicoDAO();
    
    public String mostraDadosCli(JuridicoDTO jdto){
        return jdao.mostraDados(jdto);
    }
}
