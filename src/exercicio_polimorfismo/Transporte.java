package exercicio_polimorfismo;

public class Transporte {

	    private double distancia;
	    private int passageiros;

	    public Transporte(double distancia, int passageiros) {
	        this.distancia = distancia;
	        this.passageiros = passageiros;
	    }

	    

	    public void setDistancia(double distancia) {
			this.distancia = distancia;
		}



		public void setPassageiros(int passageiros) {
			this.passageiros = passageiros;
		}


		public double getDistancia() {
	        return distancia;
	    }

	    public int getPassageiros() {
	        return passageiros;
	    }
	    
	    public void exibirDetalhes() {
	        System.out.println("Distância: " + distancia + " km");
	        System.out.println("Passageiros: " + passageiros);
	    }
	        public double calcularCusto() {
		        return 0.0;
		    }

	    }
	