package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int sal, salreceber, grat, imp;

		  
		        
		        
		        System.out.print("Digite o sal: ");
		        sal = scanner.nextInt();
		        
		
		        
		        grat = sal * 5/100;
		        imp = sal * 7/100;
		        salreceber = sal + grat - imp;
		        
		        
		
		        System.out.println("O seu novo salario é: " + salreceber);
 
		        scanner.close();
		    }
		}

