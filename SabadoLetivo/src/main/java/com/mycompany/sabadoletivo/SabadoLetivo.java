package com.mycompany.sabadoletivo;

import javax.swing.JOptionPane;

public class SabadoLetivo {

    public static void main(String[] args) {
        try{
            int c9= 0, c12 = 0, c23 = 0, c40 = 0, outros = 0, opc;
        
            do{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Informa o canal que você assiste 9, 12, 23, 40 ou outro "
                        + "\n(0 encerra a pesquisa): "));
            
            
                if(opc != 0){
                    if(opc == 9){
                        c9++;
                    } else{
                        if(opc == 12){
                            c12++;
                        } else{
                            if(opc == 23){
                            c23++;
                            } else{
                                if(opc == 40){
                                    c40++;
                                } else{
                                    outros++;
                                }
                            }
                        }
                    }
                }
            
        }while(opc != 0);
        
        JOptionPane.showMessageDialog(null, "Resultado da pesquisa:"
                + "\nCancal 9: " + c9 + " telespectadores"
                + "\nCancal 12: " + c12 + " telespectadores"
                + "\nCancal 23: " + c23 + " telespectadores"
                + "\nCancal 40: " + c40 + " telespectadores"
                + "\nOutros canais: " + outros + " telespectadores");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
            System.out.println("Erro:" + e.getMessage());
        }
    }
}   
