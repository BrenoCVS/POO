package exemplo_if;

import javax.swing.JOptionPane;

public class PrincipalMedia{
  public static void main(String[] args){

    Media media = new Media();

    double nota1, nota2;

    nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota: "));

    JOptionPane.showMessageDialog(null, "O aluno está " + media.calcular(nota1, nota2));
  }
}
