/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_05092017;

/**
 *
 * @author aline.poliveira3
 */
public class Contador {

    private int contador;

    public Contador() {
        contador = 0;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar() {
        setContador(getContador() + 1);
    }

    public void zerar() {
        setContador(0);
    }

}
