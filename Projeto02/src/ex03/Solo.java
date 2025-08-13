package ex03;

public class Solo{

  private double agua;

  public String calcular(double agua){
    this.agua = agua;

    if(agua <= 10){
      return "Solo rochoso";
    } else if((agua > 10) && (agua <= 40)){
      return "Solo firme";
    } else if((agua > 40) && (agua <= 80)){
      return "Solo pantanoso";
    } else{
      return "Quantidade de agua inválida";
    }
  } 
}
