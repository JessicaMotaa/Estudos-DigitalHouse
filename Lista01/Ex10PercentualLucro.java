package Lista01;

import java.util.Scanner;

public class Ex10PercentualLucro {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //10. Fa�a um programa para ler o c�digo, a descri��o, a quantidade, o pre�o de compra e
        //o percentual de lucro de uma mercadoria. Calcular o valor da venda com base no
        //percentual de lucro e, ainda, calcular o pre�o total em �R$� entre o pre�o da venda e
        //a quantidade. Ao final, escrever o pre�o de compra, o percentual de lucro, o pre�o da
        //venda, a quantidade e o pre�o total.

        System.out.println("Digite o c�digo da compra: ");
        String codigo = scan.next();
        System.out.println("Digite a descri��o da compra: ");
        String descricao = scan.next();
        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();
        System.out.println("Digite a pre�o:  ");
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
