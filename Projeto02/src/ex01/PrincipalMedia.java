package ex01;

import javax.swing.JOptionPane;

public class PrincipalMedia{
  public static void main(String[] args){

    Media media = new Media();

    double n1, n2, n3;
    double p1, p2, p3;

    n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));
    n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota: "));
    n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota: "));

    p1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da primeira nota (em porcentagem): "));
    p2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da segunda nota (em porcentagem): "));
    p3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso da terceira nota (em porcentagem): "));

    JOptionPane.showMessageDialog(null, "A media é: " + media.calcular(n1, n2, n3, p1, p2, p3));

  }
}
