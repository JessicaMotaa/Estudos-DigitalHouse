package Lista01;

import java.util.Scanner;

public class Ex11Idade {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //11:Faça um programa para ler o nome e o ano , mês e dia de nascimento de um cidadão.
        //Calcular e informar sua idade.
        
        String nome = "Jéssica Jones";
        int diaNascimento = 20;
        int mesNascimento = 5;
        int anoNascimento = 1980;

        int diaAtual = 16;
        int mesAtual = 3;
        int anoAtual = 2022;

        int idade = 0;

        if ((mesAtual > mesNascimento) || (mesAtual == mesNascimento && diaAtual >= diaNascimento)) {
            idade = anoAtual - anoNascimento;
        } else {
            idade = anoAtual - anoNascimento - 1;
        }
        System.out.println("Idade: " + idade);
        scan.close();
}
}
