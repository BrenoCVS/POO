/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class MotoCTR {
    MotoDAO motoDAO = new MotoDAO();
    
    public String imprimirDadosMoto(MotoDTO motoDTO){
        return motoDAO.imprimirDadosMoto(motoDTO);
    }
}
