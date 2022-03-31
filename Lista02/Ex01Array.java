package Lista02;

public class Ex01Array {
	public static void main(String[] args) {
        
        //1. Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que preencha 
        //um array com os valores: 
        
        //a)10 9 8 7 6 5 4 3 2 1
        
        int[] valores = {10,9,8,7,6,5,4,3,2,1};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valores: " + valores[i]);
		}
		//B)0 1 4 9 16 25 36 49 64 81 100
        
        int [] valores2 = {0,1,4,9,16,25,36,49,64,81,100};
	
		for (int i = 0; i < valores2.length; i++) {
		System.out.println(" Valores2: " + valores2[i]);
		}
		
        //c)1 2 3 4 5 6 10 20 30 40 50
		
        int [] valores3 = {1,2,3,4,5,10,20,30,40,50};
		
		for (int i = 0; i < valores3.length; i++) {
			System.out.println(" Valores3: " + valores3[i]);
		}

}
}