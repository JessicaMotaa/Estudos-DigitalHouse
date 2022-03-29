package Lista01;

import java.util.Scanner;

public class Ex01AcréscimoGarçom {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        //1- Faça um programa que, dado o valor da conta de uma refeição realizada em um
        //restaurante, acrescente os 10% do garçom e exiba o valor total da conta.

        int conta = scan.nextInt();
        double total = conta * 1.1;
        scan.close();
        System.out.println("Valor total com comissão: " + total);
        
}
}

