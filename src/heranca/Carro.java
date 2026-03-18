package heranca;

public class Carro extends Veiculo {

	private int qtdPortas;

	public Carro(String marca, String modelo, int ano, int qtdPortas) {
		super(marca, modelo, ano);
		this.qtdPortas = qtdPortas;
		
		
		
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Qtd portas " + qtdPortas);
	}
	
}
