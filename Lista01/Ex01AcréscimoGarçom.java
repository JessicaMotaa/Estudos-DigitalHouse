package Lista01;

import java.util.Scanner;

public class Ex01Acr�scimoGar�om {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        //1- Fa�a um programa que, dado o valor da conta de uma refei��o realizada em um
        //restaurante, acrescente os 10% do gar�om e exiba o valor total da conta.

        int conta = scan.nextInt();
        double total = conta * 1.1;
        scan.close();
        System.out.println("Valor total com comiss�o: " + total);
        
}
}

