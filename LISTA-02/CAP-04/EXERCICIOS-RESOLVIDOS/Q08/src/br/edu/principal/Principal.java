package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    	
    	double n1, n2, soma, op;
    	
    	System.out.println("MENU");
    	System.out.println("1 - Somar dois números.");
    	System.out.println("2 - Raiz quadrada de um número.");
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a opção (1 ou 2): ");
        op = sc.nextDouble();
        
        if(op == 1){
        	System.out.print("Digite um valor para o primeiro número: ");
        	n1 = sc.nextDouble();
        	System.out.print("Digite um valor para o segundo número: ");
        	n2 = sc.nextDouble();
        	
        	soma = n1 + n2;
        	System.out.println("A soma do " + n1 + " + " + n2 + " = " + soma);	
        }
        
        if(op == 2){
        	System.out.println("Digite um valor: ");
        	n1 = sc.nextDouble();
        	if(n1 < 0){
        		 System.out.println("Não é possível calcular! Número negativo.");
        	} else {
        		 double raiz = n1 / 2;
        		 for (int i = 0; i < 10; i++) {
                     raiz = (raiz + n1 / raiz) / 2;
        		 }
        		 System.out.println("A raiz quadrada de " + n1 + " é aproximadamente " + raiz);
        	}
        }
        
        if(op != 1 && op != 2){
        	System.out.println("Opção Inválida!");
        }
    }
}