/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaojava;

import java.util.Scanner;

/**
 *
 * @author Aline Paludetti de Oliveira
 */
public class Atividade01 {

    public static boolean menu(String[] lista) {
        Scanner leitor = new Scanner(System.in);
        String menu = "";
        boolean sair = false;
        do {
            System.out.println("Menu:"
                    + "\n1 - Adicionar um novo nome"
                    + "\n2 - Apresentar os nomes"
                    + "\n3 - Pesquisar um nome"
                    + "\n4 - Remover um nome"
                    + "\n0 - Sair");
            menu = leitor.nextLine();
            System.out.println("");
            switch (menu) {
                case "1":
                    lista = adicionarNome(lista);
                    sair = false;
                    break;
                case "2":
                    imprimirLista(lista);
                    sair = false;
                    break;
                case "3":
                    pesquisarLista(lista);
                    sair = false;
                    break;
                case "4":
                    lista = removerNome(lista);
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("Número invalido.");
                    sair = false;
                    break;
            }
        } while (!sair);
        return sair;
    }

    public static String[] adicionarNome(String[] lista) {
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        System.out.print("Adicionar nome: ");
        nome = leitor.nextLine();
        nome = nome.toLowerCase();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].contentEquals("")) {
                lista[i] = nome;
                break;
            }
            if (lista[i].equals(nome)) {
                System.out.println("O nome já existe na lista.");
                break;
            }
            if (i == (lista.length - 1)) {
                System.out.println("Lista cheia.");
            }
        }

        System.out.println("");
        return lista;
    }

    public static void imprimirLista(String[] lista) {
        if (lista[0] == null || lista[0] == "") {
            System.out.println("Lista vazia.");

        } else {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].contentEquals("")) {
                    System.out.println("--");
                } else {
                    System.out.println(lista[i]);
                }
            }
        }
        System.out.println("");
    }

    public static void pesquisarLista(String[] lista) {
        Scanner leitor = new Scanner(System.in);
        String pesquisa = "";
        int contador = 0;

        System.out.println("Digite o nome que deseja buscar:");
        pesquisa = leitor.nextLine();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].contains(pesquisa)) {
                System.out.println("O nome " + pesquisa + " esta na posição " + (i + 1) + " da lista.");
                break;
            } else {
                contador = contador + 1;
                if (contador == lista.length) {
                    System.out.println("nome não encontrado.");
                }
            }
        }
        System.out.println("");
    }

    public static String[] removerNome(String[] lista) {
        Scanner leitor = new Scanner(System.in);
        String pesquisa = "";
        int index = 0;
        String[] lista2 = new String[lista.length];
        lista2 = popularVetor(lista2);

        System.out.print("Nome a ser removido: ");
        pesquisa = leitor.nextLine();
        pesquisa = pesquisa.toLowerCase();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].contentEquals(pesquisa) == false && index == (lista.length-1)) {
                System.out.println("nome não encontrado");
                break;
            }
            if (lista[i].contentEquals(pesquisa)) {
                lista2[i] = "";
            } else {
                lista2[index] = lista[i];
                index = index + 1;
            }
        }

        System.out.println("");
        return lista2;
    }

    public static String[] popularVetor(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";
        }
        return lista;
    }

    public static void main(String[] args) {
        String[] lista = new String[3];
        popularVetor(lista);
        boolean menu = menu(lista);
        if (menu == true) {
            System.out.println("Fim do programa.");
        }
    }

}
