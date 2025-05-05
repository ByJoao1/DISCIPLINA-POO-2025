package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int sal, perc, aumento, novosal;

		        System.out.print("Digite o sal: ");
		        sal = scanner.nextInt();
		        
		        System.out.print("Digite o aumento: ");
		        perc = scanner.nextInt();
		        
		        aumento = sal * perc/100;
		        
		        novosal = sal + aumento;
		        
		        System.out.println("O seu novo salario é: " + novosal);
 
		        scanner.close();
		    }
		}

