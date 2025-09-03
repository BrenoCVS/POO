/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    public String mostrar(DTO dto){
        return "O codigo do funcionario é: " + dto.getCod() + ""
                + "\nO telefone do funcionario é: " + dto.getTel();
    }
}
