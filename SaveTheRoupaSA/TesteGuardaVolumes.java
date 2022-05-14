package SaveTheRoupaSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteGuardaVolumes {

	public static void main(String[] args) {
		
		Vestido vestidoDeBolinha = new Vestido("aa","Vestido Bolinha");
		Vestido vestidoPreto = new Vestido("bb","Vestido Preto");
		Vestido vestidoListrado = new Vestido("cc", "Vestido Listrado");
		Camisa camisaAmarela = new Camisa("dd","Camisa Amarela");
		Camisa camisaVermelha = new Camisa("ee","Camisa vermelha");
		
		guardaVolumes volumes = new guardaVolumes();
		int codigoPeca = volumes.guardarPecas(new ArrayList<>(Arrays.asList(vestidoDeBolinha, vestidoPreto, vestidoListrado)));
		int codigoPeca2 = volumes.guardarPecas(new ArrayList<>(Arrays.asList(camisaAmarela, camisaVermelha)));
		
		System.out.println("Código da peça: " + codigoPeca);
		
		volumes.mostrarPecas();
		volumes.devolverPeca(codigoPeca);
		
	}
}
