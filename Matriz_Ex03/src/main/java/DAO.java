/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    
    String msg = "";
    
    public String mostrar(DTO dto){
        this.msg = "";
        int mat[][] = dto.getM();
        
        for(int i = 0; i < dto.getLinhas(); i++){
            for(int j = 0; j < dto.getColunas(); j++){
                this.msg += mat[i][j] + " ";
            }
            this.msg += "\n";
        }
        
        return msg;
    }
    
    public String mostrarPrincipal(DTO dto){
        this.msg = "";
        int mat[][] = dto.getM();
        
        for(int i = 0; i < dto.getLinhas(); i++){
            for(int j = 0; j < dto.getColunas(); j++){
                if(i == j){
                    this.msg += mat[i][j] + " ";
                } else {
                    this.msg += "  ";
                }
            }
            this.msg += "\n";
        }
        
        return msg;
    }
    
    
}
