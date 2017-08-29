package revisaojava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Red
 */
public class Exercicio7 {

    public static double[] mediaAlunos() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int alunos = leitor.nextInt();
        double[] alunoMedia = new double[alunos];

        return alunoMedia;
    }

    public static double[] mediaVetor(double[] alunos) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Qual a média do " + (i + 1) + "° aluno? ");
            media = leitor.nextDouble();
            alunos[i] = media;
        }
        return alunos;
    }

    public static double mediaSala(double[] alunos) {
        double media = 0;
        double mediasala = 0;

        for (int i = 0; i < alunos.length; i++) {
            media = media + alunos[i];
        }

        mediasala = media / (alunos.length);
        return mediasala;
    }

    public static void main(String[] args) {
        double[] media = mediaAlunos();
        media = mediaVetor(media);
        System.out.println("Média da sala: " + mediaSala(media));
    }
}
