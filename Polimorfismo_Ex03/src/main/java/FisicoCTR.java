/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FisicoCTR {
    FisicoDAO fdao = new FisicoDAO();
    
    public String mostraDadosCli(FisicoDTO fdto){
        return fdao.mostraDados(fdto);
    }
}
