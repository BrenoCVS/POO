
public class DAO {
    public boolean calc(DTO dto){
        if(dto.getCod() == 1){
            
            dto.setH(dto.getH() + 1);
            return true;
        } else{
            if(dto.getCod() == 2){
                dto.setC(dto.getC() + 1);
                return true;

            } else{
                if(dto.getCod() == 3){
                    dto.setM(dto.getM() + 1);
                    return true;

                } else {
                    if(dto.getCod() == 4){
                        dto.setA(dto.getA() + 1);
                        return true;

                    } else{
                        if (dto.getCod() == 5){
                            dto.setQ(dto.getQ() + 1);
                            return true;

                        }if(dto.getCod() == 0){
                            
                            return true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
    }
    
    public String mostra(DTO dto){
        String msg = "Lanches               Quantidades           Preço";
        if(dto.getH()!=0){
            msg += "\nHamburger                   " + dto.getH() + "                            " + dto.getH()*1.5;
        }
        if(dto.getC()!=0){
            msg += "\nCheeseburger               " + dto.getC() + "                           " + dto.getC()*1.8;
        }
        if(dto.getM()!=0){
            msg += "\nMisto Quente                " + dto.getM() + "                           " + dto.getM()*1.2;
        }   
        if(dto.getA()!=0){
            msg += "\nAmericano                      " + dto.getA() + "                           " + dto.getA()*2;
        }
        if(dto.getQ()!=0){
            msg += "\nQueijo Prato                  " + dto.getQ() + "                            " + dto.getQ()*1;
        }  
        msg += "\n TOtal a pagar: " + ((dto.getH()*1.5) + (dto.getC()*1.8) + (dto.getM()*1.2 )+ (dto.getA()*2) + (dto.getQ()*1));
        return msg;
    }
  
}
