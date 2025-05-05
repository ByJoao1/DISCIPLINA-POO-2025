package br.edu.principal;
public class Principal {
    public static void main(String[] args) {
        int n, result;

        for (n = 1; n <= 10; n++) {
            System.out.println("Tabuada do " + n + ":");
            for (int i = 0; i <= 10; i++) {
                result = n * i;
                System.out.println(n + " × " + i + " = " + result);
            }
            System.out.println(" ");
        }
    }
}