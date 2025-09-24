public class CTR {

    DAO dao = new DAO();
    
    public void calc(DTO dto){
        
        dao.calc(dto);
    }
    
    public String exib(DTO dto){
        return dao.exibir(dto);
    }
}
