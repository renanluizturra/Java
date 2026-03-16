package ExercíciosPoo;

public class Exercicio_5 {

	 String tipo;
	    int potencia;
	    int quantidade;

	    void usar() {
	        quantidade = quantidade - 1;
	        System.out.println("Poção usada! Quantidade restante: " + quantidade);
	    }

	    void recarregar() {
	        quantidade = quantidade + 1;
	        System.out.println("Poção recarregada! Quantidade atual: " + quantidade);
	    }

	}