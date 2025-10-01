/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class FuncionarioCTR {
    FuncionarioDAO fdao = new FuncionarioDAO();
    
    public String imprimirDadosFunc(FuncionarioDTO fdto){
        return fdao.imprimirDadosFunc(fdto);
    }
}
