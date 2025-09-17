
public class DAO {
    public String ordena(DTO dto){
        String msg = "";
        int[] vetor = dto.getNum();
        int menos = 0, maior = 0, meio = 0;
        
        for(int i = 0; i<3; i++){
            if(i == 0){
                maior = vetor[i];
                meio = vetor[i];
                menos = vetor[i];
            }else{
                if(vetor[i] < menos){
                    menos = vetor[i];
                } else {
                    if(vetor[i] > maior){
                        maior =vetor[i];
                    } else {
                        meio = vetor[i];
                    }
                }
            }
        }
        msg = "A ordem é:"
                + "\n" + menos + " - " + meio + " - " + maior;
        
        return msg;
    }
}
