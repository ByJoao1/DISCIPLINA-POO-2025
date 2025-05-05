package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] vtr = new int[10];
        int i, j, aux;

        Scanner sc = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.print("Digite o " + (i + 1) + "º número pro vetor: ");
            vtr[i] = sc.nextInt();
        } for(i = 0; i < 9; i++){
            for(j = 0; j < 9 - i; j++){
                if(vtr[j] < vtr[j + 1]){
                    aux = vtr[j];
                    vtr[j] = vtr[j + 1];
                    vtr[j + 1] = aux;
                }
            }
        } for(i = 0; i < 10; i++) {
            System.out.print(vtr[i]);
            if(i < 9){
                System.out.print(" - ");
            }
        }
    }
}