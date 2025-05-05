package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int n, somaPares = 0, somaPrimos = 0, divisores;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                somaPares = somaPares + n;
            }

            divisores = 0;
            if (n > 1) {
                for (int j = 1; j <= n; j++) {
                    if (n % j == 0) {
                        divisores = divisores + 1;
                    }
                } if (divisores == 2) {
                    somaPrimos = somaPrimos + n;
                }
            }
        }
        System.out.println();
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.print("Soma dos números primos: " + somaPrimos);
    }
}