/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursao;

/**
 *
 * @author aline.poliveira3
 */
public class binario {

    public static void main(String[] args) {
        binario(13);
    }

    public static void binario(int numero) {
        if (numero < 2) {
            System.out.print(numero);
            return;
        }
        binario(numero / 2);
        System.out.print(numero % 2);
    }

}
