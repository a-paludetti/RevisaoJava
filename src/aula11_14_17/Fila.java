/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_14_17;

/**
 *
 * @author aline paludetti de oliveira
 */
public class Fila {
// atributos

    private Object[] dados;
    private int inicio;
    private int fim;

    // construtor
    public Fila() {
        dados = new Object[3];
        inicio = 0;
        fim = 0;
    }

    public boolean isFull() {
        return (fim + 1) % dados.length == inicio;
    }

    public boolean isEmpty() {
        return (inicio == fim);
    }

    public void enqueue(Object x) {
        if (!isFull()) {
            dados[fim] = x;
            fim++;
            if (fim == dados.length) {
                fim = 0;
            }
        }
    }

    public void furarFila(Object x) {
        if (!isFull()) {
            dados[inicio] = x;
            inicio = dados.length - 1;
        }
    }

    public Object dequeue() {
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
