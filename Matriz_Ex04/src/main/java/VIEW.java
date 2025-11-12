
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
        try {
            CTR ctr = new CTR();
            DTO dto = new DTO();
            
            double alu[][] = dto.getA();
            
            for(int i = 0; i < dto.getLinhas(); i++){
                for(int j = 0; j < 4; j++){
                    alu[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (j+1) + " nota do aluno " + (i+1) + ":"));
                }
            }
            
            dto.setA(alu);
            ctr.calc(dto);
            
            JOptionPane.showMessageDialog(null, ctr.mostrar(dto));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
