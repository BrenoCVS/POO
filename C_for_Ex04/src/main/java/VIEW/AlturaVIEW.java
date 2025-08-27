package VIEW;

import DTO.AlturaDTO;
import CTR.AlturaCTR;
import javax.swing.JOptionPane;


public class AlturaVIEW {
    public static void main(String[] args) {
        AlturaDTO alturaDTO = new AlturaDTO();
        AlturaCTR alturaCTR = new AlturaCTR();
        
        for(int cont = 0; cont < 20; cont++){
            alturaDTO.setAlt(Double.parseDouble(JOptionPane.showInputDialog("Informe a idade da " + (cont + 1) + " pessoa: ")));
            alturaCTR.calcular(alturaDTO);
        }
        
        JOptionPane.showMessageDialog(null, alturaCTR.mostra());
    }
}
