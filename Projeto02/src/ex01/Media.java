package ex01;

import javax.swing.JOptionPane;

public class Media{

    private double n1, n2, n3;
    private double p1, p2, p3;

  public double calcular(double n1, double n2, double n3, double p1, double p2, double p3){
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;

    double total = (this.n1 * (this.p1/100)) + (this.n2 * (this.p2 /100)) + (this.n3 * (this.p3/100));

    return total;

  }
}
