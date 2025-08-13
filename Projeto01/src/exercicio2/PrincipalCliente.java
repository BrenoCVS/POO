package exercicio2;

import javax.swing.JOptionPane;

public class PrincipalCliente {
    public static void main(String [] args){
        
        Cliente cliente = new Cliente();
        
        System.out.println("==== Chamando os métodos do objeto ====\n");
        
        String nome = JOptionPane.showInputDialog("Informe o nome");
        String rg   = JOptionPane.showInputDialog("Informe o RG");
        
        cliente.mostrar(nome, rg);
        
        String nome2 = JOptionPane.showInputDialog("Informe o nome 2");
        cliente.mostrarNome(nome2);
        
        System.out.println("\n==== Fim da Chamada aos métodos do objeto ====\n");
    }
}
   
