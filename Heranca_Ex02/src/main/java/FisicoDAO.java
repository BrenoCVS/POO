/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FisicoDAO extends ClienteDAO{
    public String imprimirDadosFisico (FisicoDTO fisicoDTO){
        return imprimirDados(fisicoDTO) + 
                "\nO CPF é: " + fisicoDTO.getCpf() +
                "\nO RG é: " + fisicoDTO.getRg();
    }
}
