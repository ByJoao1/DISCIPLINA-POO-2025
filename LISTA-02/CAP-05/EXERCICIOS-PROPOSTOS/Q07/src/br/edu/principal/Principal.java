package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int idade, mais50 = 0, idade1020 = 0, pesoMenor40 = 0;
        double altura, peso, porcPeso = 0, somaAlt1020 = 0, mediaAltura;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Pessoa #" + i);
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite a altura (em metros): ");
            altura = sc.nextDouble();
            System.out.print("Digite o peso (em kg): ");
            peso = sc.nextDouble();

            if (idade > 50) {
                mais50++;
            } if (idade >= 10 && idade <= 20) {
                somaAlt1020 += altura;
                idade1020++;
            } if (peso < 40) {
                pesoMenor40++;
            }
        }
        
        if (idade1020 > 0) {
            mediaAltura = somaAlt1020 / idade1020;
        } else {
            mediaAltura = 0;
        }

        porcPeso = (pesoMenor40 * 100) / 5;

        System.out.println(" ");
        System.out.println("  Resultado Final");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + mais50);
        System.out.println("Média das alturas (entre 10 e 20 anos): " + mediaAltura);
        System.out.println("Porcentagem com peso inferior a 40kg: " + porcPeso + "%");
    }
}