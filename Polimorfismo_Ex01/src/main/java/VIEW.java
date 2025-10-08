
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
            DTO dto = new DTO();
            CTR ctr = new CTR();
        
            dto.setNome(JOptionPane.showInputDialog("Informe o nome:"));
            dto.setRg(JOptionPane.showInputDialog("Informe o RG: "));
            dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
            dto.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a aultura:")));
        
            JOptionPane.showMessageDialog(null, ctr.mostrarInformacoes(dto));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
