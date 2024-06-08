package classes;

public class Caminhao extends Veiculo {
	private int eixos;
	
	


	public Caminhao(String placa, int eixos, int ano) {
		super();
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	void exibirDados() {
		
	}
}
