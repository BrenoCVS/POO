import javax.swing.JOptionPane;

public class VIEW {
 
    public static void main(String[] args) {
        try{
            CTR ctr = new CTR();
            DTO dto = new DTO();
        
            dto.setPontos(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de pontos de agua:")));
        
            JOptionPane.showMessageDialog(null, ctr.cassifica(dto));
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
   
}
