package Lista01;

import java.util.Scanner;

public class Ex13Sal�rio {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //13. Fa�a um Programa que obtenha o sal�rio-base e o n�mero de dependentes de um
        //funcion�rio e informe o sal�rio bruto (igual ao sal�rio-base + R$ 100,00 por
        //dependente), e o sal�rio l�quido, sabendo-se que o desconto para o INSS � de 10%
        //sobre o sal�rio-base.

        System.out.println("Digite o sal�rio base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        int dependentes = scan.nextInt();
        double salarioBruto = salarioBase + (100 * dependentes);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Salario Liquido: " + (salarioBruto - (salarioBase * 0.1)));
        scan.close();
}
}
