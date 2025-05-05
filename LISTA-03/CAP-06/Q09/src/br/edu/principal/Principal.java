package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int base, altura, area;

		  
		        
		        
		        System.out.print("Digite a base: ");
		        base = scanner.nextInt();
		        
		        System.out.print("Digite a altura: ");
		        altura= scanner.nextInt();
		        
		        area = (base * altura)/2;
		       
		        System.out.println(area);
 
		        scanner.close();
		    }
		}

