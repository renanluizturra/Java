package polimorfismo;

public class Boleto extends Pagamento {
	//subclasse 3
	private String codigoBarras;

	public Boleto(String titular, double valor, String codigoBarras) {
		super(titular, valor);
		this.codigoBarras = codigoBarras;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
@Override
	
	public void processarPagamento() {
		System.out.println("PROCESSANDO BOLETO");
		System.out.println("Titular: " + getTitular()); //get pq esta private
		System.out.println("Valor: "+String.format("%.2f", getValor()));
		System.out.println("Código de barras: "+ codigoBarras);
		System.out.println("Taxa: R$"+ String.format("%.2f",calcularTaxa()));
		System.out.println("Total: R$"+ String.format("%.2f",getValor()+calcularTaxa()));
		System.out.println("Pagamento do boleto concluído! ");
	}	
		
	@Override
	public double calcularTaxa() {
		return 2.50; //taxa fixa de R$ 2,50
	}

}
