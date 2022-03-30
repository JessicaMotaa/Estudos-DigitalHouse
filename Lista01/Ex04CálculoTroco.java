package Lista01;

import java.util.Scanner;

public class Ex04CálculoTroco {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //4- Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba
        //o troco a ser devolvido.

        System.out.println("Digite o valor da compra ");
        double valorMercadoria=scan.nextInt();
        System.out.println("Digite o valor da pago ");
        double valorpago=scan.nextInt();
        scan.close();
        double troco= valorpago - valorMercadoria;
        
        System.out.println(troco);
}
}