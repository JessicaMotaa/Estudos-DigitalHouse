package Lista01;

import java.util.Scanner;

public class Ex02CálculoResto {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
	//2- Faça um programa que calcule o resto da divisão inteira entre dois números dados.
    //Exemplo: se dividirmos 25 por 4, temos resto=1

    int dividendo = scan.nextInt();
    int divisor = scan.nextInt();

    System.out.println(dividendo % divisor);
    scan.close();
}
}
