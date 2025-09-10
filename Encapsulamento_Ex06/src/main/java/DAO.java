
public class DAO {
    
    public String verif(DTO dto){
        String msg = "";
        
        if((dto.getL1() + dto.getL2() > dto.getL3()) && 
                (dto.getL1() + dto.getL3() > dto.getL2()) &&
                (dto.getL2() + dto.getL3() > dto.getL1())){
            
            msg =  "E possível formar um triangulo"
                    + "\n O triangulo é: " + classifica(dto);
        } else {
            msg = "Não é possível formar um triangulo";
        }
        return msg;
        
    }
    
    private String classifica(DTO dto){
        String msg = "";
        
        if((dto.getL1() != dto.getL2()) && (dto.getL1() != dto.getL3()) && dto.getL2() != dto.getL3()){
            msg = "Escaleno";
        } else {
            if((dto.getL1() == dto.getL2()) && (dto.getL1() == dto.getL3())){
                msg = "Equilatero";
            }else{
                msg = "Isósceles";
            }
        }
        return msg;
    }
    
}
