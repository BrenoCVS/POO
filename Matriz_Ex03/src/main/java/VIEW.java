
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

            int mat[][] = dto.getM();

            for (int i = 0; i < dto.getLinhas(); i++) {
                for (int j = 0; j < dto.getColunas(); j++) {
                    mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da posição " + (i + 1) + "x" + (j + 1) + ":"));
                }
            }

            dto.setM(mat);
            JOptionPane.showMessageDialog(null, "Matriz copleta: \n " + ctr.mostrar(dto));
            JOptionPane.showMessageDialog(null, "Diagonal principal: \n " + ctr.mostrarPriancipal(dto));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
