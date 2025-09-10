import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
            DTO dto = new DTO();
            CTR ctr = new CTR();
            
            int array[] = new int[4];
            
            for(int i=0; i < 4; i++){
                array[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " numero: "));
            }
            
            dto.setNum(array);
            
            JOptionPane.showMessageDialog(null, ctr.oredena(dto));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
