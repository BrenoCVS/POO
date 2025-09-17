
public class CTR {
    DAO dao = new DAO();
    
    public boolean calc(DTO dto){
        return dao.calc(dto);
    }
    
    public String mostra(DTO dto){
        return dao.mostra(dto);
    }
}
