/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
            DTO dto = new DTO();
            CTR ctr = new CTR();
        
            int num[][] = new int[2][3];
        
            for(int linha = 0; linha< 2; linha++){
                for(int coluna = 0; coluna <3; coluna++){
                    num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da linha: " + (linha + 1) + " e coluna: " + (coluna + 1) + ": "));
                
                }
            }
            dto.setN(num);
            JOptionPane.showMessageDialog(null, ctr.mostrar(dto));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
