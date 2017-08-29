/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava;

/**
 *
 * @author Red
 */
public class Exercicio6 {

    public static void imprimirMatriz(int[][] tabuada) {
        System.out.println(" * |  1   2   3   4   5   6   7   8   9\n"
                + "-------------------------------");
        for (int i = 0; i < tabuada.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < tabuada[i].length; j++) {
                System.out.print(" |   " + tabuada[i][j] + "   ");
            }
            System.out.println("");
        }

    }

    public static int[][] tabuadaMatriz() {
        int[][] tabuada = new int[8][8];
        for (int i = 0; i < tabuada.length; i++) {
            for (int j = 0; j < tabuada[i].length; j++) {
                tabuada[i][j] = (i+1)*(j+1);
            }
        }
        return tabuada;
    }

    public static void main(String[] args) {
        int[][] tabuada = tabuadaMatriz();
        imprimirMatriz(tabuada);

    }
}
