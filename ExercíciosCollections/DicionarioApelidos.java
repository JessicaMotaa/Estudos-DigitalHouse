package ExercíciosCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DicionarioApelidos {
	
/*Criar um dicionário que represente os apelidos que uso para chamar os meus amigos. 
Para isso, o dicionário deverá ter como chave uma String e como valor uma lista de Strings.*/
	
	public static void main(String[] args) {
		

	Map<String, ArrayList<String>> apelidos = new HashMap<>();
		
	apelidos.put("João" , new ArrayList<>(Arrays.asList("Juan, Fissura, Maromba")));
	apelidos.put("Miguel" , new ArrayList<>(Arrays.asList("Night Watch, Bruce Wayne, Tampinha")));
	apelidos.put("Maria" , new ArrayList<>(Arrays.asList("Wonder Woman, Mary, Marilene")));
	apelidos.put("Lucas" , new ArrayList<>(Arrays.asList("Lukinha, Jorge, George")));
		
	System.out.println("Apelidos: ");
	apelidos.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
		
	}
	}