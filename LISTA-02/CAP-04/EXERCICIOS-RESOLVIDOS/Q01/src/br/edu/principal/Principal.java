package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    	double notaT, notaA, notaE;
    	double peso1 = 2, peso2 = 3, peso3 = 5;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Insira sua nota de Trabalho de laboratório: ");
    	notaT = sc.nextDouble();
    	if(notaT < 0 || notaT > 10) {
    		System.out.println("Nota Inválida!");
    		return;
    	} 
    	
    	System.out.print("Insira sua nota da Avaliação Semestral: ");
    	notaA = sc.nextDouble();
    	if(notaA < 0 || notaA > 10) {
    		System.out.println("Nota Inválida!");
    		return;
    	} 
    	
    	System.out.print("Insira sua nota do Exame Final: ");
    	notaE = sc.nextDouble();
    	if(notaE < 0 || notaE > 10) {
    		System.out.println("Nota Inválida!");
    		return;
    	} 
    	
    	double media = (notaT * peso1 + notaA * peso2 + notaE * peso3) / 10;
    	
    	System.out.println("Sua média é, " + media);
    	
    	if(media >= 8 & media <= 10){
    		System.out.print("Conceito A!");
    	} else if (media >= 7 & media < 8){
    		System.out.print("Conceito B!");
    	} else if (media >= 6 & media < 7){
    		System.out.print("Conceito C!");
    	} else if (media >= 5 & media < 6){
    		System.out.print("Conceito D!");
    	} else if (media >= 0 & media < 6){
    		System.out.print("Conceito E!");
    	}
    }
}