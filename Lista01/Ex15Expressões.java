package Lista01;

import java.util.Scanner;

public class Ex15Expressões {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //15. Considerando que A = 5, B = 8 e C = 10, calcule e imprima o valor das seguintes
        //expressões:
        //• Y = X * A
        //• X = A + (2 * B) / (C - 6)

        int A = 5;
        int B = 8;
        int C = 10;
        int Y = 0;
        int X = 0;
        X = A + (2 * B) / (C - 6);
        Y = X * A;
        System.out.println("Valor de X: "+X);
        System.out.println("Valor de Y: "+Y);
        
        scan.close();
	}
}
