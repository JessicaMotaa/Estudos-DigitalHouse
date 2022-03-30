package Lista01;

import java.util.Scanner;

public class Ex08CálculoMédia {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       //8.Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e
       //escrever o nome e a média. Variáveis utilizadas: NOME, N1, N2, N3, MEDIA.

        System.out.println("Digite o nome: ");
        String nome = scan.next();
        System.out.println("Digite a primeira nota: ");
        Double N1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double N2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Double N3 = scan.nextDouble();
        Double media = (N1 + N2 + N3) / 3;

        System.out.printf("Média: %.2f\n" , media);
        scan.close();
}
}
