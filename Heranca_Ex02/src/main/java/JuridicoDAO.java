/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class JuridicoDAO extends ClienteDAO{
    public String imprimirDadosJuridico(JuridicoDTO juridicoDTO){
        return imprimirDados(juridicoDTO) + 
                "\nO CNPJ é: " + juridicoDTO.getCnpj() +
                "\nO IE é: " + juridicoDTO.getIe();
    }
}
