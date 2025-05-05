package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    	int d1, m1, a1, d2, m2, a2;
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira data");
        System.out.print(" Dia (dd): ");
        d1 = sc.nextInt();
        System.out.print(" Mês (mm): ");
        m1 = sc.nextInt();
        System.out.print(" Ano (aaaa): ");
        a1 = sc.nextInt();
        System.out.println("Digite a segunda data");
        System.out.print(" Dia (dd): ");
        d2 = sc.nextInt();
        System.out.print(" Mês (mm): ");
        m2 = sc.nextInt();
        System.out.print(" Ano (aaaa): ");
        a2 = sc.nextInt();
        
        if(a1 > a2){
        	System.out.println("A maior data é, " + d1 + "/" + m1 + "/" + a1);
        } else {
        	if(a2 > a1){
        	System.out.println("A maior data é, " + d2 + "/" + m2 + "/" + a2);
        	}
        } 
        
        if(m1 > m2){
        	System.out.println("A maior data é, " + d1 + "/" + m1 + "/" + a1);
        } else {
        	if(m2 > m1){
        	System.out.println("A maior data é, " + d2 + "/" + m2 + "/" + a2);
        	}
        }
        
        if(d1 > d2){
        	System.out.println("A maior data é, " + d1 + "/" + m1 + "/" + a1);
        } else {
        	if(d2 > d1){
        	System.out.println("A maior data é, " + d2 + "/" + m2 + "/" + a2);
        	} else {
        	System.out.println("As datas são iguais.");
        	}
        } 
    }
}