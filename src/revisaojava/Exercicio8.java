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
public class Exercicio8 {

    public static int[] numeros() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int x = leitor.nextInt();
        int[] vetor = new int[x];

        return vetor;
    }

    public static int[] preencherVetor(int[] vetor) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número: ");
            numero = leitor.nextInt();
            vetor[i] = numero;
        }
        return vetor;
    }

    public static int maiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void comparacao(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero){
                System.out.println("o número "+numero+" aparece na posição "+(i+1)+".");
            }
        }
    }

    public static void main(String[] args) {
        int[] vetorNumero = numeros();
        vetorNumero = preencherVetor(vetorNumero);
        int maior = maiorNumero(vetorNumero);
        comparacao(vetorNumero, maior);
    }
}
