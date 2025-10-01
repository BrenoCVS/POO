
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
public class ClienteVIEW {
    public static void main(String[] args) {
        try{
            //Dados cliente fisico
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoCTR fisicoCTR = new FisicoCTR();
            
            fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            fisicoDTO.setEnd(JOptionPane.showInputDialog("Informe o endereço: "));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF"));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));
            
            JOptionPane.showMessageDialog(null, fisicoCTR.imprimirDadosFisico(fisicoDTO));
            
            //Dados cliente Juridico
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();
            
            juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            juridicoDTO.setEnd(JOptionPane.showInputDialog("Informe o endereço: "));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ"));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o IE: "));
            
            JOptionPane.showMessageDialog(null, juridicoCTR.imprimirDadosJuridico(juridicoDTO));
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Sistema");
            System.out.println("Erro:" + e.getMessage());
        }
    }
    
}
