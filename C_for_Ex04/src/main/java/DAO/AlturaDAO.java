package DAO;

import DTO.AlturaDTO;

public class AlturaDAO {
    
    double total;
    int maior;
    
    public void verificar(AlturaDTO alturaDTO){
        if(alturaDTO.getAlt() > 2){
            maior++;
        }
        total += alturaDTO.getAlt();
    }
    
    public double mediaAlt(){
       return total/20;
    }
    
    public String mostrar(){
        String msg = "Existem " + maior + " pessoas com altura maior que 2 metros"
                + "\nA media das alturas é " + mediaAlt();
        
        return msg;
    }
    
}
