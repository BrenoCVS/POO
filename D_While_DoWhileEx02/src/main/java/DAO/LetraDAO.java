package DAO;

import DTO.LetraDTO;

public class LetraDAO {
    int a =0, e = 0, i = 0, o = 0, u = 0, cons = 0;
    public void verif(LetraDTO letraDTO){
        
        if(letraDTO.getLetra().equalsIgnoreCase("a")){
            a++;
        } else{
             if(letraDTO.getLetra().equalsIgnoreCase("e")){
                 e++;
             } else{
                  if(letraDTO.getLetra().equalsIgnoreCase("i")){
                      i++;
                  } else {
                       if(letraDTO.getLetra().equalsIgnoreCase("o")){
                           o++;
                       } else {
                            if(letraDTO.getLetra().equalsIgnoreCase("u")){
                                u++;
                            } else{
                                if((!letraDTO.getLetra().equalsIgnoreCase("0")) && (!letraDTO.getLetra().equalsIgnoreCase(""))){
                                    cons++;
                                }
                            }
                       }
                  }
             }
        }
    }
    
    public String mostrar(){
        String msg = "Foram digitadas:"
                + "\nA = " + a + ""
                + "\nE = " + e + ""
                + "\nI = " + i + ""
                + "\nO = " + o + ""
                + "\nU = " + u + ""
                + "\nCom um total de " + (a+e+i+o+u) + " vogais"
                + "\nE " + cons + " consoantes";
        
        return msg;
    }
}
