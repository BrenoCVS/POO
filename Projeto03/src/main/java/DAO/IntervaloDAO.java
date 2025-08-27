
package DAO;
import DTO.IntervaloDTO;
public class IntervaloDAO {
    
    public String ordenar(IntervaloDTO intervaloDTO){
        
        String msg = null;
        
        for(int cont = intervaloDTO.getN1(); cont <= intervaloDTO.getN2(); cont++){
            msg += " - " + cont;
        }
    
        return msg;
    }
}
