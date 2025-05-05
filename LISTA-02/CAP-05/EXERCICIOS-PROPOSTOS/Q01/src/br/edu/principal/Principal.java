package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int a, b, c, d, gp, temp;

        Scanner sc = new Scanner(System.in);
        for (gp = 1; gp <= 5; gp++) {
            System.out.println("  Grupo " + gp);
            System.out.print("Digite um valor para A: ");
            a = sc.nextInt();
            System.out.print("Digite um valor para B: ");
            b = sc.nextInt();
            System.out.print("Digite um valor para C: ");
            c = sc.nextInt();
            System.out.print("Digite um valor para D: ");
            d = sc.nextInt();

            System.out.println("Ordem lida: " + a + " - " + b + " - " + c + " - " + d);

            if (a > b) {
                temp = a; a = b; b = temp;
            } if (a > c) {
                temp = a; a = c; c = temp;
            } if (a > d) {
                temp = a; a = d; d = temp;
            } if (b > c) {
                temp = b; b = c; c = temp;
            } if (b > d) {
                temp = b; b = d; d = temp;
            } if (c > d) {
                temp = c; c = d; d = temp;
            }
            System.out.println("Ordem crescente: " + a + " - " + b + " - " + c + " - " + d);
            System.out.println("Ordem decrescente: " + d + " - " + c + " - " + b + " - " + a);
        }
    }
}