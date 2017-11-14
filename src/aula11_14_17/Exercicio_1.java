/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_14_17;

import aula11_14_17.Pilha;
import aula11_14_17.Fila;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author aline paludetti de oliveira
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner leitor = new Scanner(System.in);
        boolean sair = false;
        Pilha p = new Pilha();

        while (!sair) {
            System.out.println("Menu: ");
            System.out.println("1 - Criptografar Mensagem");
            System.out.println("2 - Descriptografar Mensagem");
            System.out.println("0 - Sair");
            String msg = leitor.nextLine();

            switch (msg) {
                case "1":
                    p = Criptografar();
                    sair = false;
                    break;
                case "2":
                    Decriptografar(p);
                    sair = false;
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("erro.");
                    break;
            }
        }
    }

    public static Pilha Criptografar() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Mensagem: ");
        String msg = leitor.nextLine();

        Pilha p1 = new Pilha();

        for (int i = 0; i < msg.length(); i++) {
            p1.push(msg.charAt(i));
        }
        System.out.println("");
        return p1;
    }

    public static void Decriptografar(Pilha p) {
        Pilha p2 = new Pilha();

        while (!p.isEmpty()) {
            p2.push(p.pop());
        }

        while (!p2.isEmpty()) {
            System.out.print(p2.pop());
        }
        System.out.println("");
    }
}
