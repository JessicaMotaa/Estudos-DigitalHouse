package Lista01;

import java.util.Scanner;

public class Ex09C�lculoAbono {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //9. Fa�a um programa para ler o nome, departamento e o sal�rio de um funcion�rio.
        //Calcular e informar um abono de 10% (dez por cento) sobre o sal�rio e, ainda, o novo
        //sal�rio acrescido do abono.

        System.out.println("Digite o nome do funcion�rio: ");
        String nome = scan.next();
        System.out.println("Digite o departamento do funcion�rio: ");
        String departamento = scan.next();
        System.out.println("Digite o sal�rio: ");
        float salario = scan.nextFloat();

        System.out.println("Abono de : "+ salario*0.1);
        System.out.printf("S�lario com acr�scimo do abono = R$ %.2f" , salario*1.1);
        scan.close();
}
}
