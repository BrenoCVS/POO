package CTR;

import DTO.SalarioDTO;
import DAO.SalarioDAO;

public class SalarioCTR {
    SalarioDAO salarioDAO =  new SalarioDAO();
    
    public String calcular(SalarioDTO salarioDTO){
        return salarioDAO.calcular(salarioDTO);
    }
}
