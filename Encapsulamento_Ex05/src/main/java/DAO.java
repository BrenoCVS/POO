
public class DAO {
    public String calssifica(DTO dto){
        String msg = "";
        
        if(dto.getPontos() <= 10.0){
            msg = "O solo é Rochoso";
        } else{
            if((dto.getPontos() > 10) && dto.getPontos() <= 40){
                msg = "O solo é Firme";
            } else{
                if((dto.getPontos() > 40) && dto.getPontos() <= 80){
                    msg = "O solo é Pantanoso";
                } else {
                    msg = "Quantidade invalida";
                }
            }
        }
        return msg;
    }
}
