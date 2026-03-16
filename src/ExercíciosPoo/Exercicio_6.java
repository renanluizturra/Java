package ExercíciosPoo;

public class Exercicio_6 {
	
	String modelo;
    int armazenamento;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("O smartphone foi ligado!");
    }

    void desligar() {
        ligado = false;
        System.out.println("O smartphone foi desligado!");
    }

    void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Ligado: " + ligado);
    }

}