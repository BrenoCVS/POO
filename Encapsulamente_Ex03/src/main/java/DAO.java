/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
   public String veriica(DTO dto){
       if(dto.getIdade() >= 18){
           return "Pode ter CNH";
       } else{
           return "Não pode ter CNH";
       }
   }
    
}
