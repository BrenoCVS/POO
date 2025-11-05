/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 


Levando em consideração a necessidade de se desenvolver um sistema que calcule e mostre o salário a receber de um funcionário com base nas informações de número de horas trabalhadas, valor do salário mínimo e o número de horas extras trabalhadas pelo funcionário. 

As regras para se calcular o salário a receber são:

A hora trabalhada vale 1/8 do salário mínimo;
A hora extra vale ¼ do salário mínimo;
O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
 quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplicado pelo valor da hora extra;
O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.*/

package com.mycompany.trabalho;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author brenocvs
 */
public class VIEW {
    public static void main(String[] args) {
        try{
            CTR ctr = new CTR();
            DTO dto = new DTO();
        
            dto.setSal_min(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario minimo:")));
            dto.setHr(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de horas trabalhadas:")));
            dto.setHr_ex(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas extras trabalhadas:")));
        
            JOptionPane.showMessageDialog(null, ctr.calc(dto));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
