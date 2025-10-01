/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class AlunoCTR {
    AlunoDAO aDAO = new AlunoDAO();
    
    public String imprimirDadosAluno(AlunoDTO aDTO){
        return aDAO.imprimirDadosAluno(aDTO);
    }
}
