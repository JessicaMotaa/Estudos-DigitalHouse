package Lista01;

import java.util.Scanner;

public class Ex06Funcion�rio {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //6- Fa�a um Programa que leia as seguintes informa��es de um funcion�rio: matricula,
        //nome, idade, sexo, endere�o, bairro e estado civil. Escreva o nome do funcion�rio.
        System.out.println("Digite a matr�cula: ");
        int matr�cula = scan.nextInt();
        System.out.println("Digite a nome: ");
        String nome = scan.next();
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite o sexo: ");
        String sexo= scan.next();
        System.out.println("Digite o edere�o: ");
        String endereco = scan.next();
        System.out.println("Digite o bairro: ");
        String  bairro = scan.next();
        System.out.println("Digite estado civil: ");
        String estadoCivil = scan.next();

        System.out.println("O nome do Funcion�rio � " + nome);
        scan.close();
}
}