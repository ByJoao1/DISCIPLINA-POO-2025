package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    	
        double n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextInt();

        if (n1 > n2) {
            n1 = n1 + n2;  
            n2 = n1 - n2;  
            n1 = n1 - n2;  
        }

        if (n1 > n3) {
            n1 = n1 + n3;
            n3 = n1 - n3;
            n1 = n1 - n3;
        }

        if (n2 > n3) {
            n2 = n2 + n3;
            n3 = n2 - n3;
            n2 = n2 - n3;
        }

        System.out.println("A ordem crescente é: " + n1 + " - " + n2 + " - " + n3);
    }
}
