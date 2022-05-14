package ExercíciosCollections;

import java.util.HashSet;
import java.util.Set;

public class SomadeConjuntos {

	public static void main(String[] args) {
		
		Set<Integer> conjuntoInteiros = new HashSet<>();
		
		conjuntoInteiros.add(1);
		conjuntoInteiros.add(2);
		conjuntoInteiros.add(3);
		conjuntoInteiros.add(4);
		conjuntoInteiros.add(5);
		conjuntoInteiros.add(6);
	
		System.out.println(conjuntoInteiros);

		somaTotal(conjuntoInteiros);
		
	}
		private static void somaTotal(Set<Integer> conjuntoInteiros) {
			
		Integer soma =0;
			
		for(Integer valor : conjuntoInteiros) {
			soma += valor;
	}
		System.out.println("Soma dos inteiros: " +(soma));
		}

	}
		
	
	






