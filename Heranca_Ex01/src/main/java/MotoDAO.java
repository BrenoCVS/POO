/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class MotoDAO extends VeiculoDAO{
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return imprimirDadosVeiculo(motoDTO) + 
                "\nA cilindrada é: " + motoDTO.getCilindrada() +
                "\nO tipo do motor é: " + motoDTO.getTipo_motor();
    }
}
