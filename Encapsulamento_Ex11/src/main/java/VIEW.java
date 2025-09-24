
import javax.swing.JOptionPane;

public class VIEW {
    public static void main(String[] args) {
        try{
            CTR ctr = new CTR();
            DTO dto = new DTO();
            
            String opc = "1";
            
            while(!opc.equals("0")){
                if(opc.equals("1")){
                    do{
                        dto.setSex(JOptionPane.showInputDialog("Informe o sexo (M - Masculino | F - Feminino): ").toUpperCase());
                        if(!dto.getSex().equals("M") && !dto.getSex().equals("F")){
                            JOptionPane.showMessageDialog(null, "Sexo invalido, digite novamente.");
                        }
                    } while(!dto.getSex().equals("M") && !dto.getSex().equals("F"));
                    
                    dto.setSal(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario: ")));
                    ctr.calc(dto);
                } else{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
                do{
                    opc = JOptionPane.showInputDialog("Deseja informar outra pessoa? (1 - SIM | 0 - NAO) ");
                    if(!opc.equals("0") && !opc.equals("1")){
                        JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente");
                    }
                } while (!opc.equals("0") && !opc.equals("1"));
            }
            
            JOptionPane.showMessageDialog(null, ctr.exib(dto));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
