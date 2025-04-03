package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Double n1,n2,n3,mult;
		
		System.out.println("digite seu primeiro numero:");
		n1 = sc.nextDouble();
		
		System.out.println("digite seu segundo numero:");
		n2 = sc.nextDouble();
				
				System.out.println("digite seu terceiro numero:");
		n3 = sc.nextDouble();
		
		mult = n1 * n2 * n3 ;
		
		System.out.println("a multiplicação dos três número é:" + mult);
		

	}

}