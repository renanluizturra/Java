package exercíciospoo;

public class Exercicio_8main {

	public static void main(String[] args) {
		Exercicio_8 pikachu = new Exercicio_8();

        pikachu.nome = "Pikachu";
        pikachu.tipo = "Elétrico";
        pikachu.nivel = 5;

        pikachu.mostrarStatus();
        pikachu.atacar();
        pikachu.evoluir();
    }
}