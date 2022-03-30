package Lista01;

import java.util.Scanner;

public class Ex18Nadador {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //18- Elabore um programa que, dada a idade de um nadador, classifique o em uma das seguintes categorias:
       
        int idade = 12;
        String categoria;

        if (idade >= 18) {
            categoria = "Sênior";
        } else if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else {
            categoria = "Juvenil B";
        }
        System.out.println("Categoria : "+ categoria);
        scan.close();
	}
}
