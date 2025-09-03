/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author brenocvs
 */
import javax.swing.JOptionPane;

public class PrincipalTabuada {
    public static void main(String[] args) {
        try{
            Tabuada tabuada = new Tabuada();
            JOptionPane.showMessageDialog(null, 
            tabuada.calcular(
                Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o numero: ")
                )
            ));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro 001 - Deve ser informado somente números: ");
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema.");
        }
    }
 
}
