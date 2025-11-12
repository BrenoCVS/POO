/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brenocvs
 */
public class DTO {
    public int linhas = 20, colunas = 20;
    
    private int m[][] = new int[linhas][colunas];


    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int[][] getM() {
        return m;
    }

    public void setM(int[][] m) {
        this.m = m;
    }
    
    
}
