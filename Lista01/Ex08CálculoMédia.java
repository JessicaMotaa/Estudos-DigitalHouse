package Lista01;

import java.util.Scanner;

public class Ex08C�lculoM�dia {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       //8.Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e
       //escrever o nome e a m�dia. Vari�veis utilizadas: NOME, N1, N2, N3, MEDIA.

        System.out.println("Digite o nome: ");
        String nome = scan.next();
        System.out.println("Digite a primeira nota: ");
        Double N1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double N2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Double N3 = scan.nextDouble();
        Double media = (N1 + N2 + N3) / 3;

        System.out.printf("M�dia: %.2f\n" , media);
        scan.close();
}
}
