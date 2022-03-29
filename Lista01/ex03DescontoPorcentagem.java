package Lista01;

import java.util.Scanner;

public class ex03DescontoPorcentagem {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
	//3- Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15%
    //de desconto em uma venda à vista e exiba o valor a ser pago.

    System.out.println("Digite o valor da compra: ");
    int valor=scan.nextInt();
    System.out.println("Digite a porcentagem de desconto: ");
    int desconto=scan.nextInt();

    int total = valor*desconto/100;
    int valorFinal = valor-total;

    System.out.print(valorFinal);
    scan.close();
}
}