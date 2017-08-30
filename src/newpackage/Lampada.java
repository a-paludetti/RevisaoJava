/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author aline.poliveira3
 */
public class Lampada {

    public boolean aceso;

    public void desligar() {
        aceso = false;
    }

    public void ligar() {
        aceso = true;
    }

    public void imprimirEstado() {
        if (aceso == true) {
            System.out.println("ligado");
        } else {
            System.out.println("desligado");
        }
    }
    
}
