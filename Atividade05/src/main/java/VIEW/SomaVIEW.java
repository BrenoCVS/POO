
package VIEW;

import DTO.SomaDTO;
import CTR.SomaCTR;
import javax.swing.JOptionPane;

public class SomaVIEW {
    
   
    
    public static void main(String[] args) {
        
        SomaDTO somaDTO = new SomaDTO();
        SomaCTR somaCTR = new SomaCTR();
        
        for(int cont = 0; cont <10; cont++){
            somaDTO.setNum(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (cont +1) + " numero: ")));
            
            somaCTR.somar(somaDTO);
            
        }
        
        JOptionPane.showMessageDialog(null, "O total é: " + somaCTR.mostraSoma());
    }
}
