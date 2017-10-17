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
public class potencia {

    public static void main(String[] args) {
        System.out.println(potencia(5, 30));
    }

    public static int potencia(int b, int e) {
        int exp = 1;
        if (e == 0) {
            return 1;
        } else {
            exp = b * potencia(b, e - 1);
        }
        return exp;
    }

    public static int potenciaforma2(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * potenciaforma2(b, e - 1);
    }

}
