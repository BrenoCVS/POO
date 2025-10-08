
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
            
            dto.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota:")));
            dto.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota:")));
            dto.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira nota:")));
            dto.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe a quarta nota:")));
            dto.setTipo_calc(Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de calculo:"
                    + "\n1 - Média com as duas primeiras notas"
                    + "\n2 - Média com as tres primeiras notas"
                    + "\n3 - Média com as quatro notas")));
            ctr.calcularMedia(dto);
            
            JOptionPane.showMessageDialog(null, ctr.imprimir(dto));

            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
