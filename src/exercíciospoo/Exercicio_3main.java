package exercíciospoo;

public class Exercicio_3main {
	
	    public static void main(String[] args) {

	        Exercicio_3 beats = new Exercicio_3();

	        beats.marca = "Beats";
	        beats.volume = 5;
	        beats.conectado = false;

	        System.out.println("Marca: " + beats.marca);
	        System.out.println("Volume: " + beats.volume);
	        System.out.println("Conectado: " + beats.conectado);

	        beats.conectar();
	        beats.aumentarVolume();
	        beats.desconectar();

	    }

	}