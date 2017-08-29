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

    public static void repeticaoTeste(int aleatorio) {
        boolean teste = false;
        int numeroAdvinhado = 0;

        Scanner leitor = new Scanner(System.in);
        String numeroEntrada = "";
        int numero = 0;

        do {
            System.out.print("Digite um número:");
            numeroEntrada = leitor.nextLine();
            try {
                numeroAdvinhado = Integer.parseInt(numeroEntrada);
            } catch (NumberFormatException e) {
                if (numeroEntrada.contains("desistir")) {
                    System.out.println("Número incorreto. Número era: " + aleatorio);
                    break;
                } else {
                    System.out.println("número invalido.");
                }
            }
            if (numeroAdvinhado == aleatorio) {
                System.out.println("Você acertou!");
                teste = true;
            }
        } while (!teste);
    }

    public static void main(String[] args) {
        int aleatorio = aleatorio();
        repeticaoTeste(aleatorio);
    }
}
