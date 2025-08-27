
package VIEW;

import javax.swing.JOptionPane;
import DTO.IntervaloDTO;
import CTR.IntervaloCTR;

public class IntervaloVIEW {
    
    
    public static void main(String[] args) {
        
        IntervaloDTO intervaloDTO = new IntervaloDTO();
        IntervaloCTR intervaloCTR = new IntervaloCTR();
        
        intervaloDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero: ")));
        intervaloDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero: ")));

        JOptionPane.showMessageDialog(null, "A ordem é: "
                + intervaloCTR.ordem(intervaloDTO));
    }
}
