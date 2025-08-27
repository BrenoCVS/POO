
package DAO;

import DTO.SomaDTO;

public class SomaDAO {
    
    public int total = 0;
    
    public void conta(SomaDTO somaDTO){
        total += somaDTO.getNum();
    }
    
    public int mostrar(){
        return total;
    }
}
