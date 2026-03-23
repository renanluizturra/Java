package exercicio_polimorfismo;

	public class Bicicleta extends Transporte {

	    private String tipoFreio;

	    public Bicicleta(double distancia, int passageiros, String tipoFreio) {
	        super(distancia, passageiros);
	        this.tipoFreio = tipoFreio;
	    }
	    
	    

	    public String getTipoFreio() {
			return tipoFreio;
		}



		public void setTipoFreio(String tipoFreio) {
			this.tipoFreio = tipoFreio;
		}



		@Override
	    public double calcularCusto() {
	        return 0.0;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("BICICLETA");
	        super.exibirDetalhes();
	        System.out.println("Freio: " + tipoFreio);
	        System.out.printf("Custo: R$ %.2f\n", calcularCusto());
	        System.out.println("----------------------");
	    }
	}