package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int idade, somaIdades = 0, pesoAltura = 0;
        int contAltos = 0, idade1030 = 0;
        double mediaIdades, porcIdade1030, peso, altura;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("  Pessoa #" + i);
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite o peso (kg): ");
            peso = sc.nextDouble();
            System.out.print("Digite a altura (m): ");
            altura = sc.nextDouble();

            somaIdades = somaIdades + idade;

            if (peso > 90 && altura < 1.50) {
                pesoAltura = pesoAltura + 1;
            } if (altura > 1.90) {
                contAltos = contAltos + 1;
                if (idade >= 10 && idade <= 30) {
                    idade1030 = idade1030 + 1;
                }
            }
        }

        mediaIdades = somaIdades / 10;

        if (contAltos > 0) {
            porcIdade1030 = (idade1030 * 100) / contAltos;
        } else {
            porcIdade1030 = 0;
        }

        System.out.println("  Resultados");
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Pessoas com peso > 90kg e altura < 1.50m: " + pesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as que medem mais de 1.90m: " + porcIdade1030 + "%");
    }
}