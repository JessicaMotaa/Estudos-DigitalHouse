package Lista01;

import java.util.Scanner;

public class Ex12Atribuição {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //12:Considerando um Programa iniciado pelos atributos A 1, B 2, C 3 , complete o de
        //modo que ao final do Programa o conteúdo de A seja 3 , de B seja 1 e de C seja 2 . Use
        //apenas atribuições entre variáveis.
        
        int a = 1;
        int b = 2;
        int c = 3;
        int auxiliar = 0;

        System.out.println("A " + a + " B " + b + " C " + c);

        auxiliar = a;
        a = c;
        c = b;
        b = auxiliar;


        System.out.println("A " + a + " B " + b + " C " + c);
        scan.close();
}
}
