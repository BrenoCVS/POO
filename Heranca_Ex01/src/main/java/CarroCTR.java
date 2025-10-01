/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();
    
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return carroDAO.imprimirDadosCarro(carroDTO);
    }
}
