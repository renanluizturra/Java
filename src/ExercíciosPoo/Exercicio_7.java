package ExercíciosPoo;

public class Exercicio_7 {
	
	    String marca;
	    String cor;
	    int velocidadeAtual;

	    void acelerar() {
	        velocidadeAtual += 10;
	    }

	    void frear() {
	        velocidadeAtual -= 10;
	    }

	    void mostrarVelocidade() {
	        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
	    }
	}