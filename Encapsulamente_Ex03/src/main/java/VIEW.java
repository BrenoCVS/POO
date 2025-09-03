
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class VIEW {
    public static void main(String[] args) {
        try{
            CTR ctr = new CTR();
            DTO dto = new DTO();
        
            dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        
            JOptionPane.showMessageDialog(null, ctr.verificar(dto));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao executar.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
