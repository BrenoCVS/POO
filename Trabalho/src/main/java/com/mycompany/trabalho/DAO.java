/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;


public class DAO {
    public String calc(DTO dto){
        String msg = "";
        
        double valor_hr, valor_hr_ex, sal;
        
        valor_hr = (dto.getSal_min() / 8) * dto.getHr();
        
        valor_hr_ex = (dto.getSal_min() / 4) * dto.getHr_ex();
        
        sal = valor_hr + valor_hr_ex;
        
        msg = "O valor salario bruto é: " + valor_hr + ""
                + "\nO valor pelas horas extras são: " + valor_hr_ex + ""
                + "\nO valor total a ser recebido será: " + sal;
        return msg;
    }
}
