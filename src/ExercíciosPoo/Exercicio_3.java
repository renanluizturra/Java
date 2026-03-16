package ExercíciosPoo;

public class Exercicio_3 {

	    String marca;
	    int volume;
	    boolean conectado;

	    void aumentarVolume() {
	        volume = volume + 1;
	        System.out.println("Volume aumentado para: " + volume);
	    }

	    void conectar() {
	        conectado = true;
	        System.out.println("Fone conectado!");
	    }

	    void desconectar() {
	        conectado = false;
	        System.out.println("Fone desconectado!");
	    }

	}