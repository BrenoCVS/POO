
package CTR;

import DAO.LetraDAO;
import DTO.LetraDTO;

public class LetraCTR {
    LetraDAO letraDAO = new LetraDAO();
    
    public void verificar(LetraDTO letraDTO){
        letraDAO.verif(letraDTO);
    }
    
    public String mostra(){
        return letraDAO.mostrar();
    }
}
