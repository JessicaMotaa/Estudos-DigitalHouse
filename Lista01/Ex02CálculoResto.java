package Lista01;

import java.util.Scanner;

public class Ex02C�lculoResto {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
	//2- Fa�a um programa que calcule o resto da divis�o inteira entre dois n�meros dados.
    //Exemplo: se dividirmos 25 por 4, temos resto=1

    int dividendo = scan.nextInt();
    int divisor = scan.nextInt();

    System.out.println(dividendo % divisor);
    scan.close();
}
}
