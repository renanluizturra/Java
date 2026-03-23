package exercicio_polimorfismo;

public class Onibus extends Transporte {

    private int numeroLinhas;

    public Onibus(double distancia, int passageiros, int numeroLinhas) {
        super(distancia, passageiros);
        this.numeroLinhas = numeroLinhas;
        
        
    }

    public int getNumeroLinhas() {
		return numeroLinhas;
	}

	public void setNumeroLinhas(int numeroLinhas) {
		this.numeroLinhas = numeroLinhas;
	}

	@Override
    public double calcularCusto() {
        return getDistancia() * 0.80;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ÔNIBUS");
        super.exibirDetalhes();
        System.out.println("Linhas: " + numeroLinhas);
        System.out.printf("Custo: R$ %.2f\n", calcularCusto());
        System.out.println("----------------------");
    }
}