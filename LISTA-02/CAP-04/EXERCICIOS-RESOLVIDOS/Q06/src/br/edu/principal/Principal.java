package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número par ou ímpar: ");
        n = sc.nextInt();
        
        int r = n % 2;
        
        if(r == 0) {
        	System.out.print("O número é par!");
        } else
        	System.out.print("O número é ímpar!");

    }
}