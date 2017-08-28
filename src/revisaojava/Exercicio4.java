/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class Exercicio4 {

    public static int numero() {
        int numero = 0;
        String numeral;
        boolean teste = false;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            numeral = leitor.nextLine();
            try {
                numero = Integer.parseInt(numeral);
                teste = true;
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Não é um número válido.");
            }
        } while (!teste);
        return numero;
    }

    public static int media() {
        int media = 0;
        int numero = 0;
        for (int i = 0; i < 5; i++) {
            numero = numero();
            media = media + numero;
        }
        return (media/5);
    }

    public static void status(int numero) {
        if (numero < 5) {
            System.out.println("REPROVADO");
        } else if (numero >= 5 && numero < 9) {
            System.out.println("APROVADO");
        } else if (numero == 9) {
            System.out.println("PARABÉNS");
        } else {
            System.out.println("MASTER OF THE UNIVERSE");
        }
    }

    public static void main(String[] args) {
        int media = media();
        status(media);
    }
}
