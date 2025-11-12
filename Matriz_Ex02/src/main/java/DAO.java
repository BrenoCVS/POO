/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    String msg = "Nome:     Endereço\n";
    
    public String mostrar(DTO dto){
        
        String ps[][] = dto.getP();
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<2; j++){
                msg += ps[i][j] + "     ";
            }
            msg += "\n";
        }
        
        return msg;
    }
}
