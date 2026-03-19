package exercíciospoo;

public class Exercicio_2 {

	    String nome;
	    int nivel;
	    String classe;

	    void subirNivel() {
	        nivel = nivel + 1;
	        System.out.println("O personagem subiu de nível!");
	    }

	    void mostrarStatus() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Nível: " + nivel);
	        System.out.println("Classe: " + classe);
	    }
	}