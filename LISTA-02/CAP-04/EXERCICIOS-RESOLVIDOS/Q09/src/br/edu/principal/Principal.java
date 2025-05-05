package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int dia, mes, ano, hora, min;
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o dia: ");
        dia = sc.nextInt();
        System.out.print("Diga o mês: ");
        mes = sc.nextInt();
        System.out.print("Diga o ano: ");
        ano = sc.nextInt();
        

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " - ");
        
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Esse mês não existe!");
            return;
        }

        System.out.print("Digite a hora: ");
        hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        min = sc.nextInt();

        System.out.println("Hora Atual: " + (hora < 10 ? "0" + hora : hora) + ":" + (min < 10 ? "0" + min : min));

    }
}
