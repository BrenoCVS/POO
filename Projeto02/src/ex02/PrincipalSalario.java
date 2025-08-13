package ex02;

import javax.swing.JOptionPane;

public class PrincipalSalario{
  public static void main(String[] args){

    Salario salario = new Salario();

    double sal, aumento;

    sal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario do funcionario: "));
    aumento = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a porcentagem do aumento: "));

    JOptionPane.showMessageDialog(null, "O novo salario é: " +salario.calcular(sal, aumento));
  }
}
