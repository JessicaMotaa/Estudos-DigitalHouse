package Lista02;

public class Ex06MaiorNumero {
	public static void main(String[] args) {
        
        //Escreva um Array de números e devolve a posição onde se encontra o maior valor do array.
        
        int[] ArrayN = {1,3,5,7,9,8};
		int maiorNumero = 0;
		for (int i = 1; i < ArrayN.length; i++) {
			if (maiorNumero <  ArrayN[i]) {
				maiorNumero = ArrayN[i];
			}
		}
        System.out.println("O maior número do array é: " + maiorNumero);
	}
}
