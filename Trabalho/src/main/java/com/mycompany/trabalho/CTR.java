/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

/**
 *
 * @author brenocvs
 */
public class CTR {
    DAO dao = new DAO();
    
    public String calc(DTO dto){
        return dao.calc(dto);
    }
}
