
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
            
            String ps[][] = dto.getP();
            
            for(int i =0; i<5; i++){
                ps[i][0] = JOptionPane.showInputDialog("Informe o nome da " + (i + 1) + " pessoa:" );
                ps[i][1] = JOptionPane.showInputDialog("Informe o endereço da " + (i + 1) + " pessoa: ");
            }
            dto.setP(ps);
            
            JOptionPane.showMessageDialog(null, ctr.mostrar(dto));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
