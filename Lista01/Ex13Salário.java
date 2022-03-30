package Lista01;

import java.util.Scanner;

public class Ex13Salário {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //13. Faça um Programa que obtenha o salário-base e o número de dependentes de um
        //funcionário e informe o salário bruto (igual ao salário-base + R$ 100,00 por
        //dependente), e o salário líquido, sabendo-se que o desconto para o INSS é de 10%
        //sobre o salário-base.

        System.out.println("Digite o salário base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        int dependentes = scan.nextInt();
        double salarioBruto = salarioBase + (100 * dependentes);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Salario Liquido: " + (salarioBruto - (salarioBase * 0.1)));
        scan.close();
}
}
