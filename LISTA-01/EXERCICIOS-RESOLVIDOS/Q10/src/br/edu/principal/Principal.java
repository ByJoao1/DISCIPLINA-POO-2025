package br.edu.principal;
import java.util.Scanner;

	public class Principal {
		public static void main(String[] args) {
		        
		  Scanner scanner = new Scanner(System.in);
		  	double  area, raio;
		  		System.out.print("Digite o raio: ");
		  			raio = scanner.nextInt();
		  				area = 3.1415 * raio;
		  					System.out.println(area);
		  						scanner.close();
		    }
}