
import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
        CTR ctr = new CTR();
        DTO dto = new DTO();
        
        int[] vetor = new int[3];
        
        for(int i = 0; i < 3; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "  + (i + 1) + " numero: "));
        }
        
        dto.setNum(vetor);
        
        JOptionPane.showMessageDialog(null, ctr.ordena(dto));
    
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
