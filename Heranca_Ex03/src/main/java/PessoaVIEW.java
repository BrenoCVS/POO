
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class PessoaVIEW {
    public static void main(String[] args) {
        try{
            //Dados do Funcionario
            FuncionarioDTO fdto = new FuncionarioDTO();
            FuncionarioCTR fctr = new FuncionarioCTR();
            
            fdto.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            fdto.setEnd(JOptionPane.showInputDialog("Informe o endereço:"));
            fdto.setTel(JOptionPane.showInputDialog("Informe o telefone:"));
            fdto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
            fdto.setSiape(JOptionPane.showInputDialog("Informe o SIAPE:"));
            fdto.setFunc(JOptionPane.showInputDialog("Informe o função: "));
            
            JOptionPane.showMessageDialog(null, fctr.imprimirDadosFunc(fdto));
            
            //Dados do Aluno
            AlunoDTO adto = new AlunoDTO();
            AlunoCTR actr = new AlunoCTR();
            
            adto.setNome(JOptionPane.showInputDialog("Informe o nome: "));
            adto.setEnd(JOptionPane.showInputDialog("Informe o endereço:"));
            adto.setTel(JOptionPane.showInputDialog("Informe o telefone:"));
            adto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));
            adto.setPront(JOptionPane.showInputDialog("Informe o prontuario: "));
            adto.setCurso(JOptionPane.showInputDialog("Informe o curso:"));
            
            JOptionPane.showMessageDialog(null, actr.imprimirDadosAluno(adto));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistemna");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
