package Lista01;

import java.util.Scanner;

public class Ex11Idade {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //11:Fa�a um programa para ler o nome e o ano , m�s e dia de nascimento de um cidad�o.
        //Calcular e informar sua idade.
        
        String nome = "J�ssica Jones";
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
