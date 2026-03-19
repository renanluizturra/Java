package exercicios_heranca;

public class Eletronico extends Produto {
	
	private String garantiaMeses;

	public Eletronico(String nome, double preco, int quantidade, String garantiaMeses) {
		super(nome, preco, quantidade);
		this.garantiaMeses = garantiaMeses;
	}

	public String getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(String garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Garantia:  " + garantiaMeses);
	}
	
}

	


