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
    
    public void calcularMedia(DTO dto){
        dao.calcularMedia(dto);
    } 
    
    public String imprimir(DTO dto){
        return dao.imprimir();
    }
}
