
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
            
            dto.setNome(JOptionPane.showInputDialog("Informe o seu Nome: "));
            dto.setRg(JOptionPane.showInputDialog("Informe o seu RG: "));
            dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
            
            JOptionPane.showMessageDialog(null, ctr.mostarNomeRg(dto));
            JOptionPane.showMessageDialog(null, ctr.mostrarNomeIdade(dto));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
