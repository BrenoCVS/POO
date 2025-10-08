/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DAO {
    public String mostrarInformacoes(DTO dto){
        return "O nome informado foi: " + dto.getNome() +
                "\nO RG informado foi: " + dto.getRg() + 
                verifica(dto.getIdade()) + 
                verifica(dto.getAltura());
    }
    
    public String verifica(int idade){
        if(idade > 18){
            return "\nIdade maior que 18 anos, pode entrar no brinquedo";
        } else{
            return "\nIdade menot que 18 anos, não pode entrar no brinquedo";
        }
    }
    
    public String verifica(double alt){
        if(alt > 1.50){
            return "\nAltura maior que 1,50, pode entrar no brinquedo";
        }else{
            return "\nAltura menor que 1,50, não pode entrar no brinquedo";
        }
    }
}
