package ExercíciosCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Listas {

/*Definir e inicializar uma nova lista vazia. 
Adicionar os seguintes elementos à lista vazia: 1,5,5,6,7,8,8,8.*/
	
	public static void main(String[] args) {
	
	List<Integer> meusNumeros = new ArrayList<>();
	
	meusNumeros.add(1);
	meusNumeros.add(5);
	meusNumeros.add(5);
	meusNumeros.add(6);
	meusNumeros.add(7);
	meusNumeros.add(8);
	meusNumeros.add(8);
	meusNumeros.add(8);
	
	System.out.println("Números: " + meusNumeros);//Possui valores repetidos.
	
/*Definir um novo conjunto vazio. Adicionar os seguintes elementos ao conjunto: 1,5,5,6,7,8,8,8.
 Imprimir e dizer qual a diferença desse exercício para o anterior*/
	
	Set<Integer> conjuntoNumeros = new HashSet<>();
	
	conjuntoNumeros.add(1);
	conjuntoNumeros.add(5);
	conjuntoNumeros.add(5);
	conjuntoNumeros.add(6);
	conjuntoNumeros.add(7);
	conjuntoNumeros.add(8);
	conjuntoNumeros.add(8);
	conjuntoNumeros.add(8);
	
	System.out.println("Conjunto: " + conjuntoNumeros);//Não possui valores repetidos.
}
}
