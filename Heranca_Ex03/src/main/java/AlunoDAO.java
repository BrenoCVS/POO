/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class AlunoDAO extends PessoaDAO{
    public String imprimirDadosAluno (AlunoDTO aDTO){
        return imprimirDados(aDTO) + 
                "\nO prontuario é: " + aDTO.getPront() + 
                "\nO curso é: " + aDTO.getCurso();
    }
}
