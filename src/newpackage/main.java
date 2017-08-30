/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import newpackage.Lampada;
/**
 *
 * @author aline.poliveira3
 */
public class main {

    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.imprimirEstado();
        l1.ligar();
        l1.imprimirEstado();
        
        Lampada l2 = new Lampada();
        l2.imprimirEstado();
        l1.imprimirEstado();
        l1.desligar();
        l2.ligar();
        
        l1.imprimirEstado();
        l2.imprimirEstado();
        
    }

}
