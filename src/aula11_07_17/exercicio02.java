/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_07_17;

import aula11_07_17.Queue;
import java.util.Scanner;

/**
 *
 * @author Red
 */
public class exercicio02 {

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner leitor = new Scanner(System.in);
        String d = leitor.nextLine();

        for (int i = 0; i < d.length(); i++) {
            if (Character.isUpperCase(d.charAt(i))) {
                q.enqueue(i);
            }
        }

        while (!q.isFull()) {
        char c = (char) q.dequeue();
            System.out.println(c);
        }
    }
}
