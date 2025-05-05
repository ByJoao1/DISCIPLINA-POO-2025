package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int sal, salreceber, imp;

		  
		        
		        
		        System.out.print("Digite o sal: ");
		        sal = scanner.nextInt();
		        
		        
		        
		        imp = sal * 10/100;
		        salreceber = sal + 50 - imp;
		        
		        System.out.println("O seu novo salario é: " + salreceber);
 
		        scanner.close();
		    }
		}

