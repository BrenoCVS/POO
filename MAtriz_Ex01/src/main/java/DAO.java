/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    
    String resposta = "";
    
    public String mostrar(DTO dto){
        
        int n[][] = dto.getN();
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                this.resposta += n[linha][coluna] + " ";
            }
            this.resposta += "\n";
        }
        
        return this.resposta;
    }
}
