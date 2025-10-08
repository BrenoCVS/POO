/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class ClienteDAO {
    public String mostraDados(ClienteDTO cdto){
        return "O nome é: " + cdto.getNome() +
                "\nA cidade é: " + cdto.getCidade() +
                "\nO estado é: " + cdto.getEstado() +
                "\nO endereço é: " + cdto.getEndereco() +
                "\nO numero é: " + cdto.getNumero();
    }
}
