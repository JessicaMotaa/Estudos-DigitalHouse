package Exerc�ciosCollections;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
/*Criar um dicion�rio que represente os priemiros 5 n�meros da "loteria dos sonhos", junto com seu significado.
Para isso, o dicion�rio dever� ter como chave Integer e como valor String.*/
	
	public static void main(String[] args) {
		
		Map<Integer, String> loteriaDosSonhos = new HashMap<>();
		
		loteriaDosSonhos.put(0, "Ovos");
		loteriaDosSonhos.put(1, "�gua");
		loteriaDosSonhos.put(2, "Escopeta");
		loteriaDosSonhos.put(3, "Cavalo");
		loteriaDosSonhos.put(4, "Dentista");
		loteriaDosSonhos.put(5, "Fogo");
		
		for (Map.Entry<Integer, String> entry : loteriaDosSonhos.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}
	
}
