
public class DAO {

    public String classifica(DTO dto){
        String msg = "", c="";
        
        if(dto.getAlt()<1.2){
            if(dto.getPes() <= 60){
                c = "A";
            } else{
                if(dto.getPes() > 90){
                    c = "G";
                }else{
                    c = "D";
                }
            
              }
            
        }else {
            if((dto.getAlt() >= 1.2) && (dto.getAlt() <= 1.7)){
                if(dto.getPes() <= 60){
                    c ="B";
            } else{
                if(dto.getPes() > 90){
                    c = "H";
                }else{
                    c = "E";
                }
            
              }
            } else{
                if(dto.getPes() <= 60){
                    c = "C";
            } else{
                if(dto.getPes() > 90){
                    c = "I";
                }else{
                    c = "F";
                }
            
              }
            }
        }
        msg = "A classificação é: " + c;
        
        return msg;
    }
}
