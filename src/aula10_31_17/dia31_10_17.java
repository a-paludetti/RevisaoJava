package aula10_31_17;


import java.util.Scanner;
import aula10_31_17.Step;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aline.poliveira3
 */
public class dia31_10_17 {
  
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("palavra: ");
        String palavra = leitor.nextLine();
        
        int tamanho = palavra.length();
        
        Step p = new Step(tamanho);
    }
}
