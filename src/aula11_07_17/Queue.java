/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_07_17;

/**
 *
 * @author Red
 */
public class Queue { //emprementação de Fila/Queue

    private Object[] dados;
    private int inicio;
    private int fim;

    public Queue() {
        dados = new Object[50];
        inicio = 0;
        fim = 0;
    }

    public boolean isFull() {
        return (fim + 1) % dados.length == inicio;
    }

    public boolean isEmpty() {
        return (inicio == fim);
    }

    public void enqueue(Object x) { // enfileirar objetos
        if (!isFull()) {
            dados[fim] = x;
            fim++;
            if (fim == dados.length) {
                fim = 0;
            }
        }
    }

    public Object dequeue() { // desenfileirar objetos
        if (!isEmpty()) {
            Object x = dados[inicio];
            inicio++;
            if (inicio == dados.length) {
                inicio = 0;
            }
            return x;
        }
        return null;
    }

}
