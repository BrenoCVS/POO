public class DAO {
    public String ordena(DTO dto){
        String msg = "";
        int array[];
        array = dto.getNum();
        
        if(array[0] > array[3]){
            msg = array[2] + " - " + array[1] + " - " + array[0] + " - " + array[3];
        } else{
            if((array[3] >= array[0]) && (array[3] < array[1])){
                msg = array[2] + " - " + array[1] + " - " + array[3] + " - " + array[0];

            } else{
                if((array[3] >= array[1]) && (array[3] < array[2])){
                    msg = array[2] + " - " + array[3] + " - " + array[1] + " - " + array[0];
                } else{       
                    msg = array[3] + " - " + array[2] + " - " + array[1] + " - " + array[0];
                }
            }
        }
        
        return "A ordem decrescente é: "
                + "\n " + msg;
    }
}
