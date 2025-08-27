package VIEW;

import DTO.SalarioDTO;
import CTR.SalarioCTR;
import javax.swing.JOptionPane;

public class SalarioVIEW {
    public static void main(String[] args) {
        SalarioCTR salarioCTR = new SalarioCTR();
        SalarioDTO salarioDTO = new SalarioDTO();
        
        salarioDTO.setTempo(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano a ser calculado: ")));
        JOptionPane.showMessageDialog(null, salarioCTR.calcular(salarioDTO));
    }
}
