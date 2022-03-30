package Lista01;

import java.util.Scanner;

public class Ex10PercentualLucro {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //10. Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e
        //o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no
        //percentual de lucro e, ainda, calcular o preço total em “R$” entre o preço da venda e
        //a quantidade. Ao final, escrever o preço de compra, o percentual de lucro, o preço da
        //venda, a quantidade e o preço total.

        System.out.println("Digite o código da compra: ");
        String codigo = scan.next();
        System.out.println("Digite a descrição da compra: ");
        String descricao = scan.next();
        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();
        System.out.println("Digite a preço:  ");
        Double precoCompra = scan.nextDouble();
        System.out.println("Digite o percentual de lucro: ");
        Double percentualLucro = scan.nextDouble();

        double precoVenda = precoCompra*(1+percentualLucro/100);
        System.out.printf("Preco Compra %.2f \n" , precoCompra);
        System.out.println("lucro " + percentualLucro + "%");
        System.out.printf("Preco venda %.2f\n", precoVenda);
        System.out.printf("Preco total %.2f\n", precoVenda*quantidade);
        scan.close();
}
}
