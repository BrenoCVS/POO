package ex02;

public class Salario{
 
  private double sal, aumento;

  public double calcular(double sal, double aumento){
    this.sal = sal;
    this.aumento = aumento;

    double total = this. sal +(this.sal * this.aumento / 100);
  
    return total;
  }
}
