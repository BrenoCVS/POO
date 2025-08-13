package ex03;

import javax.swing.JOptionPane;

public class PrincipalSolo{
  public static void main(String[] args){

    Solo solo = new Solo();

    double agua = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade de agua no solo: "));

    JOptionPane.showMessageDialog(null, solo.calcular(agua));
  }
}
