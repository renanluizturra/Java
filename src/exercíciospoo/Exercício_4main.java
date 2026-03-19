package exercíciospoo;

public class Exercício_4main {

	public static void main(String[] args) {

		        Exercicio_4 falcon = new Exercicio_4();

		        falcon.modelo = "Falcon X";
		        falcon.bateria = 85;
		        falcon.voando = false;

		        falcon.mostrarStatus();

		        falcon.decolar();
		        falcon.mostrarStatus();

		        falcon.pousar();
		        falcon.mostrarStatus();

		    }

		}