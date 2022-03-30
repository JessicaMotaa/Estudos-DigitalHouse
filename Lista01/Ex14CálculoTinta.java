package Lista01;

import java.util.Scanner;

public class Ex14CálculoTinta {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //14:Faça um Programa que calcule a quantidade nece ssária de tinta e o número de latas,
        //para pintar uma parede de Xm de largura por Ym de altura. Considere que o consumo
        //de tinta é de 3 litros por metro quadrado e a quantidade de tinta por lata é de 2
        //litros.
        

        float quantidadeDeTinta = 0f;
        float numeroDeLatas = 0f; 
        float alturaDaParede = 2.80f;
        float larguraDaParede = 4.0f;

        quantidadeDeTinta = (alturaDaParede * larguraDaParede) * 3;
        numeroDeLatas = quantidadeDeTinta / 2;

        System.out.println("Quantidade de tinta a ser usada: " + quantidadeDeTinta + "L");
        System.out.println("Total de latas: " + numeroDeLatas + "unid");

        scan.close();
}
}
