/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class CTR {
    DAO dao = new DAO();
    
    public void calc(DTO dto){
        dao.calc(dto);
    }
    
    public String mostrar(DTO dto){
        return dao.mostrar(dto);
    }
}
