package SaveTheRoupaSA;

public abstract class peca {
	
	private String marca;
	private String modelo;
	
	
	public peca(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}



	public abstract void retirada();



	@Override
	public String toString() {
		return "peca [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	}	

