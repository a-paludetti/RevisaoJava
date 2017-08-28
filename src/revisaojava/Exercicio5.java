/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class Exercicio5 {

    public static int aleatorio() {
        Random numeroAleatorio = new Random();
        int numero = numeroAleatorio.nextInt(3);
        return numero;
    }

    public static int numeroAdvinhado(int aleatorio) {
        Scanner leitor = new Scanner(System.in);
        String numeroEntrada = "";
        int numero = 0;

        System.out.print("Digite um número:");
        numeroEntrada = leitor.nextLine();
        try {
            numero = Integer.parseInt(numeroEntrada);
        } catch (NumberFormatException e) {
            if (numeroEntrada.contains("desistir")) {
                System.out.println("Número incorreto. Número era: "+aleatorio);
            } else{
                System.out.println("número invalido.");
            }
        }
        return numero;
    }

    public static boolean testeNumero(int aleatorio, int advinhado) {
        boolean teste = false;
        if (aleatorio == advinhado) {
            teste = true;
            return teste;
        } else {
            return teste;
        }
    }

    public static boolean repeticaoTeste(int aleatorio) {
        boolean teste = false;
        int numeroAdvinhado = 0;
        do {
            numeroAdvinhado = numeroAdvinhado(aleatorio);
            teste = testeNumero(aleatorio, numeroAdvinhado);
        } while (!teste);
        return teste;
    }

    public static void main(String[] args) {
        int aleatorio = aleatorio();
        boolean teste = repeticaoTeste(aleatorio);
        System.out.println(teste);

    }
}
