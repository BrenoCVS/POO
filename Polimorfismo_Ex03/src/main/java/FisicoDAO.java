/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FisicoDAO extends ClienteDAO{
    
    public String mostraDados(FisicoDTO fdto){
        return super.mostraDados(fdto) + 
                "\n o CPF é: " + fdto.getCpf() +
                "\nO RG é: " + fdto.getRg();
    }
    
}
