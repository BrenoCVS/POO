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
    
    public void calc(DTO dto){
        double alu[][] = dto.getA();
        
        for(int i = 0; i < dto.getLinhas(); i++){
            
            alu[i][4] = (alu[i][0] + alu[i][1] + alu[i][2] + alu[i][3]) / 4;
        }
    }
    
    public String mostrar(DTO dto){

        double alu[][] = dto.getA();
        
        for(int i = 0; i < dto.getLinhas(); i++){
            
            this.msg += "Aluno 01: " + alu[i][0] + " | " + alu[i][1] + " | " + alu[i][2] + " | " + alu[i][3] + " | média: " + alu[i][4] + "\n";
            
        }

        return msg;
    }
    
}
