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
        
            dto.setCod(Integer.parseInt(JOptionPane.showInputDialog("INforme o codigo: ")));
            dto.setTel(JOptionPane.showInputDialog("Informe o telefone: "));
        
            JOptionPane.showMessageDialog(null, ctr.mostar(dto));
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
