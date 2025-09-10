
public class DAO {
    public String mostra(DTO dto){
        String msg = "";
        double media = (dto.getN1() + dto.getN2())/2;
        
        if(media >= 7){
            msg = "O aluno esta APROVADO com média " + media;
        } else{
            if(media < 4){
                msg = "O aluno esta REPROVADO com média " + media;
            }
            else{
                msg = "O aluno esta de RECUPERAÇÃO " + media;
            }
        }
        
        return msg;
        
    }
}
