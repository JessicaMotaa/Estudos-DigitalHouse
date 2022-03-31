package Lista02;

public class Ex07ImparPar {
	public static void main(String[] args) {
        
        //7.Crie um Array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
     
		int[] ArrayX = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < ArrayX.length; i++) {
		if ((ArrayX[i] % 2 ) != 0) {
			ArrayX[i] = -1;
		}else 
			ArrayX[i] = 1;
		}
		System.out.println("Array: ");
		for (int i = 0; i < ArrayX.length; i++) {
		System.out.println(ArrayX[i]);
	}
}
}