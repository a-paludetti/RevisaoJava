package aula31_10_17;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aline.poliveira3
 */
public class Step { //nova Classe Pilha
    //atributos

    private Object[] dados;
    private int topo;

    //Construtor, pilha Vazia
    public Step(int tamanho) {
        dados = new Object[tamanho];
        topo = -1;
    }

    //metodos
    public boolean isFull() {
        return (topo == dados.length - 1);
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public void push(Object x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        } else {
            System.out.println("~~cheio~~");
        }
    }
    
    public Object pop(){
    }

}
