/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class ClienteDAO {
    public String imprimirDados(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() +
                "\nO estado é: " + clienteDTO.getEstado() +
                "\nA cidade é: " + clienteDTO.getCidade() +
                "\nO endereço é: " + clienteDTO.getEnd() +
                "\nO numero é: " + clienteDTO.getNumero();
    }
}
