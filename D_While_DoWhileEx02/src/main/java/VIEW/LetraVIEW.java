package VIEW;

import DTO.LetraDTO;
import CTR.LetraCTR;
import javax.swing.JOptionPane;

public class LetraVIEW {
    public static void main(String[] args) {
        LetraDTO letraDTO = new LetraDTO();
        LetraCTR letraCTR = new LetraCTR();
        
        do{
            letraDTO.setLetra(JOptionPane.showInputDialog("Informe a letra (para encerrar digite 0): "));
            letraCTR.verificar(letraDTO);
        } while(!letraDTO.getLetra().equals("0"));
    
        JOptionPane.showMessageDialog(null, letraCTR.mostra());
    }
}
