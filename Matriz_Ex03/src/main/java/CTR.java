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
    
    public String mostrar(DTO dto){
        return dao.mostrar(dto);
    }
    
    public String mostrarPriancipal (DTO dto){
        return dao.mostrarPrincipal(dto);
    }
}
