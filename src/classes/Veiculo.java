package classes;


public class Veiculo {
	
	private String placa;
	private int ano;

	
	
	public Veiculo(String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}
	
	
	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	void exibirDados() {
		
	}
	
    public static Veiculo conversao(String arqString){
    	//Funç. para exibir dados no console
        String[] partes = arqString.split(";");
        String placa= partes[0];
        int ano= Integer.parseInt(partes[1]);
        return new Veiculo(placa, ano);
    }

}
