/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_05092017;

import exercicio2_05092017.Contador;

public class Main {

    public static void main(String[] args) {
        Contador C = new Contador();

        System.out.println(C.getContador());

        C.incrementar();
        C.incrementar();
        C.incrementar();

        System.out.println(C.getContador());
        C.incrementar();

        System.out.println(C.getContador());
        C.zerar();

        System.out.println(C.getContador());
    }
}
