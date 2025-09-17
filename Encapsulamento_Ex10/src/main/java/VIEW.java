
import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{

            DTO dto = new DTO();
            CTR ctr = new CTR();
        
        
            do{
                dto.setCod(Integer.parseInt(JOptionPane.showInputDialog("\n 01    Hamburger     1,50  "
                                             + "\n 02    Cheeseburge   1,80     "
                                             + "\n 03    Misto Quente  1,20     "
                                             + "\n 04     Americano    2,00     "
                                             + "\n 05    Queijo Prato   1,00    "
                                             + "\n 00       Fecha o menu        ")));
            
                if(ctr.calc(dto) == false){
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            
            
            }while(dto.getCod() != 0);
        
            JOptionPane.showMessageDialog(null, ctr.mostra(dto));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro: " + e.getMessage());
    }
    
    }

}
