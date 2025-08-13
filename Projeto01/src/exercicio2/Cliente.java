package exercicio2;

public class Cliente {
    private String nome, rg;
        
        public void mostrar(String nome, String rg){
            this.nome = nome;
            this.rg = rg;
            
            System.out.println("O nome informado foi: " + this.nome + "\nO rg informado foi: " + this.rg);
            
        }// Fecha método mostrar
        
        public String mostrarNome(String nome){
            this.nome = nome;
            return "O nome informado foi: " + this.nome;
           
        }//Fecha método mostrar nome
    
}
