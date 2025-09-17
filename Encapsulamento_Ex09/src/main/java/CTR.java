public class CTR {
    DAO dao = new DAO();
    
    public String classifica(DTO dto){
        return dao.classifica(dto);
    }
}
