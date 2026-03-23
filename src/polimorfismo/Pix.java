package polimorfismo;

public class Pix extends Pagamento {
	//subclasse 2
	
	private String chavePix;

	public Pix(String titular, double valor, String chavePix) {
		super(titular, valor);
		this.chavePix = chavePix;
		
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	@Override
	
	public void processarPagamento() {
		System.out.println("PROCESSANDO PIX");
		System.out.println("Titular: " + getTitular()); //get pq esta private
		System.out.println("Valor: "+String.format("%.2f", getValor()));
		System.out.println("Chave PIX: "+ chavePix);
		System.out.println("Taxa: R$"+ String.format("%.2f",calcularTaxa()));
		System.out.println("Total: R$"+ String.format("%.2f",getValor()+calcularTaxa()));
		System.out.println("Transferência PIX realizada! ");
	}	
		
	@Override
	public double calcularTaxa() {
		return 0.0; //Pix sem taxa
	}
	

}

