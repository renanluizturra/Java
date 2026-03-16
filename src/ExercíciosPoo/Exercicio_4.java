package ExercíciosPoo;

public class Exercicio_4 {


    String modelo;
    int bateria;
    boolean voando;

    void decolar() {
        voando = true;
        System.out.println("O drone decolou!");
    }

    void pousar() {
        voando = false;
        System.out.println("O drone pousou!");
    }

    void mostrarStatus() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Voando: " + voando);
    }

}