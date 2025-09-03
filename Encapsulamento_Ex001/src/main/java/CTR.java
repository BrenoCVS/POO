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
    
    public String mostarNomeRg(DTO dto){
        return dao.mostraNomeRg(dto);
    }
    
    public String mostrarNomeIdade(DTO dto){
        return dao.mosrarNomeIdade(dto);
    }
    
}
