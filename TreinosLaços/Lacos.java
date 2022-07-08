package TreinosLaços;

import java.util.Scanner;

public class Lacos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Nome de usuario");
			nomeUser = scan.next();
			
			System.out.println("Digite a senha");
			senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				System.out.println("SEnha igual a usuario");
			}else {
				infoValidas = true;
				System.out.println("Senha e usuario validos");
			}
		}while (!infoValidas);
	}
}
