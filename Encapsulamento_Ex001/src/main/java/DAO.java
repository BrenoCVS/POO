/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    public String mostraNomeRg(DTO dto){
        return "O nome informado foi: " + dto.getNome() +""
                + "\nO RG informado foi: " + dto.getRg();
    }
    
    public String mosrarNomeIdade(DTO dto){
        return "O nome informado foi: " + dto.getNome() + ""
                + "\nA idade informada foi: " + dto.getIdade();
    }
}
