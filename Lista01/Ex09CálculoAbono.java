package Lista01;

import java.util.Scanner;

public class Ex09CálculoAbono {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //9. Faça um programa para ler o nome, departamento e o salário de um funcionário.
        //Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo
        //salário acrescido do abono.

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.next();
        System.out.println("Digite o departamento do funcionário: ");
        String departamento = scan.next();
        System.out.println("Digite o salário: ");
        float salario = scan.nextFloat();

        System.out.println("Abono de : "+ salario*0.1);
        System.out.printf("Sálario com acréscimo do abono = R$ %.2f" , salario*1.1);
        scan.close();
}
}
