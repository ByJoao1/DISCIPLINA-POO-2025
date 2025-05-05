package br.edu.principal;
public class Principal {
    public static void main(String[] args) {
        double preco, lucro, maiorLucro = 0;
        int ingressos, ingressosMax = 0;
        double precoMax = 0;

        System.out.println("PREÇO      INGRESSOS        LUCRO");

        for (preco = 5.00; preco >= 1.00; preco -= 0.50) {
            ingressos = (int)(120 + ((5.00 - preco) / 0.50) * 26);

            double receita = preco * ingressos;
            lucro = receita - 200;

            System.out.println("R$ " + preco + "   " + ingressos + " ingressos   R$ " + lucro);

            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                precoMax = preco;
                ingressosMax = ingressos;
            }
        }
        System.out.println(" ");
        System.out.println("- Lucro máximo esperado:");
        System.out.println("Preço do ingresso: R$ " + precoMax);
        System.out.println("Ingressos vendidos: " + ingressosMax);
        System.out.println("Lucro: R$ " + maiorLucro);
    }
}