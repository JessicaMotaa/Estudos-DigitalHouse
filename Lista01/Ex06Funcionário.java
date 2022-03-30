package Lista01;

import java.util.Scanner;

public class Ex06Funcionário {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //6- Faça um Programa que leia as seguintes informações de um funcionário: matricula,
        //nome, idade, sexo, endereço, bairro e estado civil. Escreva o nome do funcionário.
        System.out.println("Digite a matrícula: ");
        int matrícula = scan.nextInt();
        System.out.println("Digite a nome: ");
        String nome = scan.next();
        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite o sexo: ");
        String sexo= scan.next();
        System.out.println("Digite o edereço: ");
        String endereco = scan.next();
        System.out.println("Digite o bairro: ");
        String  bairro = scan.next();
        System.out.println("Digite estado civil: ");
        String estadoCivil = scan.next();

        System.out.println("O nome do Funcionário é " + nome);
        scan.close();
}
}