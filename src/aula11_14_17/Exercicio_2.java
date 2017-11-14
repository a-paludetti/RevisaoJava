/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_14_17;

import aula11_14_17.Fila;

/**
 *
 * @author aline paludetti de oliveira
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        Fila f = new Fila();

        f.enqueue("1");
        f.enqueue("2");
        f.furarFila("3");

        System.out.print(f.dequeue());
        System.out.print(f.dequeue());
        System.out.print(f.dequeue());

    }
}
