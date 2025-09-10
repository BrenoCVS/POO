
import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
            DTO dto = new DTO();
            CTR ctr = new CTR();
            
            dto.setL1(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do primeiro lado: ")));
            dto.setL2(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do segundo lado: ")));
            dto.setL3(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do terceiro lado: ")));
            
            JOptionPane.showMessageDialog(null, ctr.triangulo(dto));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
