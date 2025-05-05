package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       
        int n1, n2, n3, n4;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números em ordem crescente: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.print("Digite um número (fora de ordem): ");
        n4 = sc.nextInt();

        if (n4 > n3) {
            System.out.println("A ordem decrescente é: " + n4 + " - " + n3 + " - " + n2 + " - " + n1);
        } else if (n4 > n2 && n4 < n3) {
            System.out.println("A ordem decrescente é: " + n3 + " - " + n4 + " - " + n2 + " - " + n1);
        } else if (n4 > n1 && n4 < n2) {
            System.out.println("A ordem decrescente é: " + n3 + " - " + n2 + " - " + n4 + " - " + n1);
        } else if (n4 < n1) {
            System.out.println("A ordem decrescente é: " + n3 + " - " + n2 + " - " + n1 + " - " + n4);
        }

    }
}
