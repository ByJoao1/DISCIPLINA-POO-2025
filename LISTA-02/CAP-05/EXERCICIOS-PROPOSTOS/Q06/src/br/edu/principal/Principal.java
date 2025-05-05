package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        char cod;
        double valor, totalAVista = 0, totalAPrazo = 0, totalGeral = 0, totalParcelas = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 15; i++) {
            System.out.println("  Transação #" + i);
            System.out.print("Digite o código da transação (V para à vista ou P para a prazo): ");
            cod = sc.next().charAt(0);

            System.out.print("Digite o valor da transação: R$ ");
            valor = sc.nextDouble();

            if (cod == 'V' || cod == 'v') {
                totalAVista = totalAVista + valor;
            } else if (cod == 'P' || cod == 'p') {
                totalAPrazo = totalAPrazo + valor;
            } else {
                System.out.println("Código inválido. Somente 'V' ou 'P' são aceitos!");
                i--;
            }
            totalGeral = totalGeral + valor;
        }
        totalParcelas = totalAPrazo / 3;

        System.out.print(" ");
        System.out.println("  Relatório de transações:");
        System.out.println("Total de compras à vista: R$ " + totalAVista);
        System.out.println("Total de compras a prazo: R$ " + totalAPrazo);
        System.out.println("Total geral das compras: R$ " + totalGeral);
        System.out.println("Valor da primeira parcela das compras a prazo: R$ " + totalParcelas);
    }
}
