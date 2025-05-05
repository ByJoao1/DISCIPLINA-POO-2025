package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int idade, totalPessoas = 8;;
        int fx1 = 0, fx2 = 0, fx3 = 0, fx4 = 0, fx5 = 0;
        double porcFx1, porcFx5;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa #" + i + ": ");
            idade = sc.nextInt();

            if (idade <= 15) {
                fx1++;
            } else if (idade <= 30) {
                fx2++;
            } else if (idade <= 45) {
                fx3++;
            } else if (idade <= 60) {
                fx4++;
            } else {
                fx5++;
            }
        }
        System.out.println(" ");
        System.out.println("- Quantidade de pessoas por faixa etária:");
        System.out.println("1ª Faixa (até 15 anos): " + fx1);
        System.out.println("2ª Faixa (16 a 30 anos): " + fx2);
        System.out.println("3ª Faixa (31 a 45 anos): " + fx3);
        System.out.println("4ª Faixa (46 a 60 anos): " + fx4);
        System.out.println("5ª Faixa (acima de 60 anos): " + fx5);

        porcFx1 = (fx1 * 100) / totalPessoas;
        porcFx5 = (fx5 * 100) / totalPessoas;

        System.out.println("Porcentagem de pessoas na 1ª faixa: " + porcFx1 + "%");
        System.out.println("Porcentagem de pessoas na 5ª faixa: " + porcFx5 + "%");
    }
}