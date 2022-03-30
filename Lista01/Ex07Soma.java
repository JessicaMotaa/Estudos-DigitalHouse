package Lista01;

import java.util.Scanner;

public class Ex07Soma {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //7. Faça um programa que leia dois números inteiros e escreva a soma entre eles.

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scan.nextInt();
        int total = numeroUm + numeroDois;
        System.out.println("O resultado da soma entre os número é: " + total);
        scan.close();
}
}