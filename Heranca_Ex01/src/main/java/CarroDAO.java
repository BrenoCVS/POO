/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class CarroDAO extends VeiculoDAO{
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return imprimirDadosVeiculo(carroDTO) + 
                "\nA potencia é: " + carroDTO.getPotencia() +
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
