package Exercício_encapsulamento;

public class Exercicio_4 {
	 private String modelo;
	    private int ano;
	    private double velocidade;

	    // Construtor
	    public Exercicio_4(String modelo, int ano, double velocidade) {
	        this.modelo = modelo;
	        this.ano = ano;
	        this.velocidade = velocidade;
	    }

	    
	    public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public int getAno() {
			return ano;
		}


		public void setAno(int ano) {
			this.ano = ano;
		}


		public double getVelocidade() {
			return velocidade;
		}


		public void setVelocidade(double velocidade) {
			this.velocidade = velocidade;
		}


		// Acelerar
	    public void acelerar(double valor) {
	        velocidade += valor;
	    }

	    // Frear
	    public void frear(double valor) {
	        velocidade -= valor;

	        if (velocidade < 0) {
	            velocidade = 0;
	        }
	    }

	    // Mostrar velocidade
	    public void mostrarVelocidade() {
	        System.out.println("Velocidade atual: " + velocidade + " km/h");
	    }
	}

