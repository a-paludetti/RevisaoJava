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
public class Exercicio2 {

    public static boolean ehPar(String entrada) {
        boolean par = false;
        int numero = Integer.parseInt(entrada);
        if (numero % 2 == 0) {
            par = true;
            return par;
        } else {
            return par;
        }
    }

    public static String ehNumero() {
        Scanner leitor = new Scanner(System.in);

        boolean teste = false;
        int numero;
        String entrada;

        do {
            System.out.print("Número: ");
            entrada = leitor.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                teste = true;
                return entrada;
            } catch (NumberFormatException e) {
                System.out.println("Não é um número válido.");
            }
        } while (teste == false);
        return entrada;
    }

    public static boolean ehPrimo(String entrada) {
        int numero = Integer.parseInt(entrada);
        int contador = 0;
        boolean primo = false;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador = contador + 1;
            }
        }

        if (contador == 2) {
            primo = true;
            return primo;
        }
        return primo;
    }

    public static void teste(String numero) {
        boolean primo = ehPrimo(numero);
        boolean par = ehPar(numero);
        if (primo == true && par == true) {
            System.out.println("O número " + numero + " é um número par e pertence aos números primos.");
        } else if (primo == true && par == false) {
            System.out.println("O número " + numero + " é um número ímpar e pertence aos números primos.");
        } else if (primo == false && par == true) {
            System.out.println("O número " + numero + " é um número par e não pertence aos números primos.");
        } else {
            System.out.println("O número " + numero + " é um número ímpar e não pertence aos números primos.");
        }
    }

    public static void main(String[] args) {
        String numero = ehNumero();
        teste(numero);
    }
}
