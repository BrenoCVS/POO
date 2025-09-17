
import javax.swing.JOptionPane;


public class VIEW {
    
    public static void main(String[] args) {
        try{
            CTR ctr = new CTR();
            DTO dto = new DTO();
        
            dto.setAlt(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: ")));
            dto.setPes(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "))); 
        
            JOptionPane.showMessageDialog(null, ctr.classifica(dto));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
