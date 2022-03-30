package Lista01;

import java.util.Scanner;

public class Ex16PesoBagagem {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //16: Em um aeroporto, a balan�a de bagagem envia a informa��o de peso da bagagem
        //desacompanhada para um computador que calcula o valor do excesso de peso com
        //os seguintes par�metros:

        double pesoDaBagagem = 25.0;
        double valorExcesso = 0;

        if (pesoDaBagagem <= 20) {
            valorExcesso = 0;
        } else if (pesoDaBagagem > 40) {
            valorExcesso = (pesoDaBagagem - 20) * 10000;
        } else {
            valorExcesso = (pesoDaBagagem - 20) * 5000;
        }

        System.out.println("Valor pagamento: " + valorExcesso);
        
        scan.close();
	}
}
