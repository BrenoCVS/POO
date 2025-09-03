/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

/**
 *
 * @author brenocvs
 */
public class Tabuada {
    private int numero;
    private String resp = "";
    
    public String calcular(int numero){
        try{
            this.numero = numero;
            for(int i =1; i <= 10;i++){
                this.resp += this.numero + " x " + i + " = " + this.numero*i+"\n";
            }
            return this.resp;
        }
        catch(Exception e ){
            return this.resp;
        }
    }
}
