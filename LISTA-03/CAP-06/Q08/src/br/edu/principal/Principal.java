package br.edu.principal;

import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        int dep, taxa, rend, total;


		        System.out.print("Digite o valor do deposito: ");
		        dep = scanner.nextInt();
		        
		        System.out.print("Digite o valor da taxa: ");
		        taxa = scanner.nextInt();
		      
		        
		    
		        
		        
		        rend = dep * taxa/100;
		        total = dep + rend;
		        System.out.println("O seu novo rendimento é: " +  total);
 
		        scanner.close();
		    }
		}

