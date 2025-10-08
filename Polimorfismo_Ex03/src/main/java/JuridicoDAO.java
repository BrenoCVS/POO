/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class JuridicoDAO extends ClienteDAO{
    
    public String mostraDados(JuridicoDTO jdto){
        return super.mostraDados(jdto) + 
                "\nO CNPJ é: " + jdto.getCnpj() +
                "\nO IE é: " + jdto.getIe();
    }
}
