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
public class Exercicio3 {

    public static int numero() {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        String entrada;
        boolean teste = false;

        do {
            System.out.print("Digite um número: ");
            entrada = leitor.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Não é um número válido.");
            }
        } while (!teste);
        return numero;
    }

    public static String testeNumero(int numero) {
        String numeroPorExtenso = "";
        switch (numero) {
            case 1:
                numeroPorExtenso = "Um.";
                break;
            case 2:
                numeroPorExtenso = "Dois.";
                break;
            case 3:
                numeroPorExtenso = "Três.";
                break;
            case 4:
                numeroPorExtenso = "Quatro.";
                break;
            case 5:
                numeroPorExtenso = "Cinco.";
                break;
            case 6:
                numeroPorExtenso = "Seis.";
                break;
            case 7:
                numeroPorExtenso = "Sete.";
                break;
            case 8:
                numeroPorExtenso = "Oito.";
                break;
            case 9:
                numeroPorExtenso = "Nove.";
                break;
            case 0:
                numeroPorExtenso = "Zero.";
                break;
            default:
                System.out.println("Número inválido.");
        }
        return numeroPorExtenso;
    }

    public static void main(String[] args) {
        int entradaNumero = numero();
        System.out.println(testeNumero(entradaNumero));
    }
}
