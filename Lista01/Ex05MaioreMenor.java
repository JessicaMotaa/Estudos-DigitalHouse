package Lista01;

import java.util.Scanner;

public class Ex05MaioreMenor {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    //5. Escreva um programa que, dado tr�s n�meros, informe o maior e o menor.
    
    int valor1 = 5;
    int valor2 = 7;
    int valor3 = 9;

    if (valor1 > valor2 && valor1 > valor3) {
        System.out.println("O valor " + valor1 + " � o maior");
    } else if (valor2 > valor1 && valor2 > valor3) {
        System.out.println("O valor " + valor2 + " � o maior");
    } else {
        System.out.println("O valor " + valor3 + " � o maior");
    }
    if (valor1 < valor2 && valor1 < valor3) {
        System.out.println("O valor " + valor1 + " � o menor");
    } else if (valor2 < valor1 && valor2 < valor3) {
        System.out.println("O valor " + valor2 + " � o menor");
    } else {
        System.out.println("O valor " + valor3 + " � o menor");
    }
    scan.close();
}
}