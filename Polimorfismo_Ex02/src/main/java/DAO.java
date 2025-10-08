/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    
    private double media;
    private int erro = 0;
    
    public void calcularMedia(DTO dto){
        if(dto.getTipo_calc() == 1){
            calcularMedia(dto.getN1(), dto.getN2());
        } else {
            if(dto.getTipo_calc() == 2){
                calcularMedia(dto.getN1(), dto.getN2(), dto.getN3());
            } else {
                if(dto.getTipo_calc() == 3){
                    calcularMedia(dto.getN1(), dto.getN2(), dto.getN3(), dto.getN4());
                } else{
                    erro++;
                } 
            }
        }
    }
    
    private void calcularMedia(double n1, double n2){
        media = (n1 + n2)/2;
    }
    
    private void calcularMedia(double n1, double n2, double n3){
        media = (n1 + n2 + n3)/3;
    }
    
    private void calcularMedia(double n1, double n2, double n3, double n4){
        media = (n1 + n2 + n3 + n4)/4;
    }
    
    public String imprimir(){
        if(erro != 0){
            return "Opção de calculo inválida";
        } else {
            return "O resultado da média é: " + media;
        }
    }
}
