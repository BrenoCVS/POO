/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class VeiculoDAO {
    public String imprimirDadosVeiculo(VeiculoDTO veiculoDTO){
        return "A placa é: " + veiculoDTO.getPlaca()
                + "\nA cor é: " + veiculoDTO.getCor();
    }
}
