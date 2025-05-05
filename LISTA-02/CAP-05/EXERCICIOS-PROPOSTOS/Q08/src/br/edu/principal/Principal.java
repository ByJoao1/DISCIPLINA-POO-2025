package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int idade, mais50Menos60 = 0, alturaBaixa = 0;
        int porcA, somaIdadeBaixa = 0, olhosA = 0, ruivosSemOlhosA = 0;
        double mediaIdadeBaixa, peso, altura;
        char corO, corC;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("  Pessoa #" + i);
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite o peso (kg): ");
            peso = sc.nextDouble();
            System.out.print("Digite a altura (em metros): ");
            altura = sc.nextDouble();
            System.out.print("Digite a cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            corO = sc.next().charAt(0);
            System.out.print("Digite a cor dos cabelos (P - preto, C - castanho, L - louro, R - ruivo): ");
            corC = sc.next().charAt(0);

            if (idade > 50 && peso < 60) {
                mais50Menos60++;
            } if (altura < 1.50) {
                somaIdadeBaixa = somaIdadeBaixa + idade;
                alturaBaixa++;
            } if (corO == 'A' || corO == 'a') {
                olhosA = olhosA + 1;
            } if ((corC == 'R' || corC == 'r') &&
                    !(corO == 'A' || corO == 'a')) {
                ruivosSemOlhosA = ruivosSemOlhosA + 1;
            }
        } if (alturaBaixa > 0) {
            mediaIdadeBaixa = somaIdadeBaixa / alturaBaixa;
        } else {
            mediaIdadeBaixa = 0;
        }

        porcA = (olhosA * 100) / 6;

        System.out.println(" ");
        System.out.println("  Resultados");
        System.out.println("Quantidade com mais de 50 anos e menos de 60kg: " + mais50Menos60);
        System.out.println("Média de idade das pessoas com menos de 1.50m: " + mediaIdadeBaixa);
        System.out.println("Porcentagem com olhos azuis: " + porcA + "%");
        System.out.println("Quantidade de ruivos sem olhos azuis: " + ruivosSemOlhosA);
    }
}
