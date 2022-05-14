package SaveTheRoupaSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class guardaVolumes {

	private Map<Integer, ArrayList<peca>> mapVolumes;
	private Integer contador;

	public guardaVolumes() {
		this.mapVolumes = new HashMap<Integer, ArrayList<peca>>();
		this.contador = 1;
	}

	public Integer guardarPecas(ArrayList<peca> listaDePeca) {
		Integer identificador = contador;
		contador++;
		mapVolumes.put(identificador, listaDePeca);
		return identificador;
	}

	public void mostrarPecas() {
		mapVolumes.forEach((chave, valor) -> System.out.println(chave + " : " + valor));
	}

	public void mostrarPecas(Integer numero) {
		System.out.println(numero + " : " + mapVolumes.get(numero));
	}

	public void devolverPeca(Integer numero) {
		mapVolumes.remove(numero);
		System.out.println("As peças foram removidas.");
	}
}
