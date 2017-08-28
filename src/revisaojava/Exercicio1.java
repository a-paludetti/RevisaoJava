/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava;

import java.util.Scanner;

/**
 *
 * @author Red
 */
public class Exercicio1 {

    public static boolean verificacao1(double N) {
        if (N >= 50.0) {
            return true;
        } else {
            return false;
        }
    }

    public static void verificacao2(boolean verificado) {
        if (verificado == true){
            System.out.println("SUCESSO.");
        } else {
            System.out.println("ERRO.");
        }
        System.out.println("FIM DO PROGRAMA.");
    }

    public static double numero() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Número: ");
        double numero = leitor.nextDouble();

        return numero;
    }

    public static void main(String[] args) {
        double numero = numero();
        verificacao2(verificacao1(numero));
    }

}
