
public class DAO {
    public void calc(DTO dto){
        if(dto.getSex().equals("M")){
            dto.setH(dto.getH() + 1);
        } else{
            dto.setM(dto.getM() + 1);
    
            if(dto.getSal() <= 300){
                dto.setTotal_m(dto.getTotal_m() + 1);
            }
        }
        dto.setTotal(dto.getTotal() + 1);
        dto.setTotal_sal(dto.getTotal_sal() + dto.getSal());
    }
    
    public String exibir(DTO dto){
        double porcent_h, porcent_m, porcent_menor, med_sal;
        String msg = "";
        porcent_h = dto.getH() / dto.getTotal() * 100;
        porcent_m = dto.getM() / dto.getTotal() * 100;
        porcent_menor = dto.getTotal_m() / dto.getM() * 100;
        med_sal = dto.getTotal_sal() / dto.getTotal();
        if(dto.getM() == 0){
            porcent_menor = 0;
        }
        
        msg = "A media salarial dos habitantes ouvidos é: R$" + med_sal + ""
                + "\nA porcentagem de homens é: " + porcent_h + "%"
                + "\nA porcentagem de mulheres é: " + porcent_m + "%"
                + "\nA porcentagem de mulheres que recebem R$300 ou menos é: " + porcent_menor + "%";
        
        return msg;
    }
}

