package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int NUM_ALUNOS = 10;
        final int NUM_QUESTOES = 8;
        char[] gabarito = new char[NUM_QUESTOES];
        int[] numerosAlunos = new int[NUM_ALUNOS];
        char[][] respostas = new char[NUM_ALUNOS][NUM_QUESTOES];
        int[] notas = new int[NUM_ALUNOS];
        int aprovados = 0;

        Scanner sc = new Scanner(System.in);

 
        System.out.println("Digite o gabarito da prova (A, B, C, D ou E):");
        for (int i = 0; i < NUM_QUESTOES; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase().charAt(0);
        }

        
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Número do aluno " + (i + 1) + ": ");
            numerosAlunos[i] = sc.nextInt();

            System.out.println("Respostas do aluno (A, B, C, D ou E):");
            for (int j = 0; j < NUM_QUESTOES; j++) {
                System.out.print("Questão " + (j + 1) + ": ");
                respostas[i][j] = sc.next().toUpperCase().charAt(0);
            }
        }

       
        for (int i = 0; i < NUM_ALUNOS; i++) {
            int nota = 0;
            for (int j = 0; j < NUM_QUESTOES; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    nota++;
                }
            }
            notas[i] = nota;
            if (nota >= 6) {
                aprovados++;
            }
        }

        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("Aluno " + numerosAlunos[i] + " - Nota: " + notas[i]);
        }

     
        double porcentagem = (aprovados * 100.0) / NUM_ALUNOS;
        System.out.printf("Porcentagem de aprovação: ", porcentagem);

        sc.close();
    }
}
