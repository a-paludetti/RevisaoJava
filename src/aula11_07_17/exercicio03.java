/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_07_17;

import aula11_07_17.Queue;
import aula10_31_17.Step;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class exercicio03 {
    // criar uma funcão que receba uma String e indique se ele é um palindromo, usando Step & Queue
    // ex: 'arara' 'apos a sopa' & 'reviver' 

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Palavra:");
        String palavra = leitor.nextLine();

        palavra = palavra.trim();
        Queue fila = new Queue();
        Step pilha1 = new Step(palavra.length());
        Step pilha2 = new Step(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha1.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            fila.enqueue(pilha1.pop());
            
        }

    }
}
