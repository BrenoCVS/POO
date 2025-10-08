
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class ClienteVIEW {
    public static void main(String[] args) {
        try{
            //Cliente Físico
            FisicoDTO fdto = new FisicoDTO();
            FisicoCTR fctr = new FisicoCTR();
            
            fdto.setNome(JOptionPane.showInputDialog("Informe o nome do cliente Físico:"));
            fdto.setEstado(JOptionPane.showInputDialog("Informe o estado do cliente Físico: "));
            fdto.setCidade(JOptionPane.showInputDialog("Informe a cidade do cliente físico:"));
            fdto.setEndereco(JOptionPane.showInputDialog("Informe o endereço do cliente Físico:"));
            fdto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do cliente Físico:")));
            fdto.setCpf(JOptionPane.showInputDialog("Informe o CPF do cliente Físico:"));
            fdto.setRg(JOptionPane.showInputDialog("Informe o RG do cliente Físico:"));
            
            JOptionPane.showMessageDialog(null, fctr.mostraDadosCli(fdto));
            
            //CLiente Juridico
            JuridicoDTO jdto = new JuridicoDTO();
            JuridicoCTR jctr = new JuridicoCTR();
            
            jdto.setNome(JOptionPane.showInputDialog("Informe o nome do cliente Juridico:"));
            jdto.setEstado(JOptionPane.showInputDialog("Informe o estado do cliente Juridico: "));
            jdto.setCidade(JOptionPane.showInputDialog("Informe a cidade do cliente Juridico:"));
            jdto.setEndereco(JOptionPane.showInputDialog("Informe o endereço do cliente Juridico:"));
            jdto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do cliente Juridico:")));
            jdto.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ do cliente Juridico:"));
            jdto.setIe(JOptionPane.showInputDialog("Informe o IE do cliente Juridico:"));
            
            JOptionPane.showMessageDialog(null, jctr.mostraDadosCli(jdto));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
