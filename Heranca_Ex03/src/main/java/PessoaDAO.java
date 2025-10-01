/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class PessoaDAO {
    public String imprimirDados(PessoaDTO pDTO){
        return "O nome é: " + pDTO.getNome() +
                "\nO endereço é: " + pDTO.getEnd() +
                "\nO telefone é: " + pDTO.getTel() +
                "\nA idade é: " + pDTO.getIdade();
    }
    
}
