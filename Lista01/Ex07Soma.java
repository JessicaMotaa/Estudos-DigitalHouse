package Lista01;

import java.util.Scanner;

public class Ex07Soma {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //7. Fa�a um programa que leia dois n�meros inteiros e escreva a soma entre eles.

        System.out.println("Digite o primeiro n�mero: ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        int numeroDois = scan.nextInt();
        int total = numeroUm + numeroDois;
        System.out.println("O resultado da soma entre os n�mero �: " + total);
        scan.close();
}
}