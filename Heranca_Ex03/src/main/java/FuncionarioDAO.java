/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FuncionarioDAO extends PessoaDAO{
    public String imprimirDadosFunc(FuncionarioDTO fDTO){
        return imprimirDados(fDTO) + 
                "\nO siape é: " + fDTO.getSiape() + 
                "\nA função do funcioanrio é: " + fDTO.getFunc() + 
                "\n" + calc(fDTO);
    }
    
    public String calc(FuncionarioDTO fDTO){
        if(fDTO.getIdade() >= 60 ){
            return "O funcionario ja pode se aposentar";
        } else{
            
            return "Faltam " + (60 - fDTO.getIdade()) + " anos para o funcionario poder se aposentar"; 
        }
    }
}


