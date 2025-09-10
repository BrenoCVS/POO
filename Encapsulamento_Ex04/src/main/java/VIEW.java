import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
            DTO dto = new DTO();
            CTR ctr = new CTR();
    
            dto.setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe o primeira nota: ")));
            dto.setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe o segunda nota: ")));
            
            JOptionPane.showMessageDialog(null, ctr.mostra(dto));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao executar");
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
