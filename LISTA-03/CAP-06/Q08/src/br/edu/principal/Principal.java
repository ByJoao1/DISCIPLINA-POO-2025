package br.edu.principal;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        final int TAM = 5;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM * 2];

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

       
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < TAM; i++) {
            C[i] = A[i];
            C[i + TAM] = B[i];
        }

        Arrays.sort(C);

      
        System.out.println("\nVetor A ordenado:");
        for (int num : A) System.out.print(num + " ");

        System.out.println("\n\nVetor B ordenado:");
        for (int num : B) System.out.print(num + " ");

        System.out.println("\n\nVetor C (junção ordenada):");
        for (int num : C) System.out.print(num + " ");

        sc.close();
    }
}
