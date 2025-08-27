package DAO;

import DTO.SalarioDTO;

public class SalarioDAO {
    
    public String calcular(SalarioDTO salarioDTO){
        String msg = null;
        double sal_fin = 1000;
        
        if(salarioDTO.getTempo() == 2010){
            
            
            msg = "O salario do funcionario no ano " + salarioDTO.getTempo() + " é " + sal_fin;
        } else{
            if(salarioDTO.getTempo() < 2010){
                msg = "Erro, digite uma data válida";
            }
            else{
                int a = salarioDTO.getTempo() - 2010;
                double porcen = 0.015;
                for(int cont = 0; cont < a; cont++){
                    sal_fin = sal_fin + (sal_fin * porcen);
                    porcen *= 2;
                }
                msg = "O salario do funcionario no ano " + salarioDTO.getTempo() + " é " + sal_fin;
            }
        }
        
        
        
        return msg;
        
    }
}
