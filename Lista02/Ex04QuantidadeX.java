package Lista02;

public class Ex04QuantidadeX {
	public static void main(String[] args) {
        
     // Crie um array de inteiros A e um valor inteiro X e retorna a quantidade de vezes que X aparece no Array A.
        
        int[] valoresRepetidos = {1,2,3,4,2,5,6,2,7,2};
		int x = 2;
		int count = 0;
		for (int i = 0; i < valoresRepetidos.length; i++) {
				if (valoresRepetidos[i] == x) {
					count++;
				}
			}
			System.out.println("Vezes em que o valor x aparece: " + count);

	}
}

