package ExercíciosPoo;

public class Exercicio_8 {

	 String nome;
	    String tipo;
	    int nivel;

	    void atacar() {
	        System.out.println(nome + " usou um ataque!");
	    }

	    void evoluir() {
	        nivel++;
	        System.out.println(nome + " evoluiu! Nível atual: " + nivel);
	    }

	    void mostrarStatus() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Tipo: " + tipo);
	        System.out.println("Nível: " + nivel);
	    }
	}