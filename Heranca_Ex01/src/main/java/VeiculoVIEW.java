
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class VeiculoVIEW {
    
    public static void main(String[] args) {
        try{
            //Dados do Carro
            CarroDTO carroDTO = new CarroDTO();
            CarroCTR carroCTR = new CarroCTR();
        
            carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro:"));
            carroDTO.setCor(JOptionPane.showInputDialog("Informe a cor do carro:"));
            carroDTO.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a potencia do carro:")));
            carroDTO.setQtd_portas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas do carro:")));

            JOptionPane.showMessageDialog(null, carroCTR.imprimirDadosCarro(carroDTO));
        
            //Dados da Moto
            MotoDTO motoDTO = new MotoDTO();
            MotoCTR motoCTR = new MotoCTR();
        
            motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa da moto: "));
            motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor da moto: "));
            motoDTO.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada da moto:")));
            motoDTO.setTipo_motor(JOptionPane.showInputDialog("Informe o tipo do motor (2T / 4T)").toUpperCase());
        
            JOptionPane.showMessageDialog(null, motoCTR.imprimirDadosMoto(motoDTO));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Sistema");
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
