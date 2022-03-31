package Lista02;

public class Ex05ArrayeBoolean {
	public static void main(String[] args) {
        
     // Escreva um array de inteiros a e devolve um array de boolean onde, cada posição 
     // indique true se o elemento da posição correspondente a é positivo e 
     // false caso seja negativo ou zero.
        
        int[] ArrayA = {1,-2,3,-4,5,-6,7};
		boolean[] arrayBoolean = new boolean[7];
		for (int i = 0; i < ArrayA.length; i++) {
			if (ArrayA[i] > 0) {
				arrayBoolean[i] = true;
			}else {
				arrayBoolean[i] = false;
			}
		}
		System.out.println("Array A: \t");
		for (int i = 0; i < ArrayA.length; i++) {
			System.out.print(ArrayA[i] + "\t");
		}
		System.out.println();
		System.out.println("Array Boolean: \t");
		for (int i = 0; i < arrayBoolean.length; i++) {
		System.out.print(arrayBoolean[i] + "\t");
		}
}
}