package Lista01;

import java.util.Scanner;

public class Ex17PesoIdeal {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //17.
        //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
        //programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
        //Para homens: 72.7 * altura) 58;
        //Para mulheres: 62.1 * altura) 44.7;

        double pesoideal;
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Informe seu sexo (M ou F): ");
        char sexo = scan.next().charAt(0);

        if (sexo == 'F') {
            pesoideal = (62.1 * altura) -44.7;
            System.out.println("Peso ideal: " + String.format ("%.2f" , pesoideal));
        }else if (sexo == 'M'){
            pesoideal = (72.7 * altura) -58;
            System.out.println("Peso ideal: " + String.format ("%.2f" , pesoideal));
        }else {
            System.out.println("Valor informado inválido.");
        }
        
        scan.close();
	}
}
