package ExercíciosPoo;

public class Exercicio_1main {

	    public static void main(String[] args) {

	        Exercicio_1 anduril = new Exercicio_1();

	        anduril.nome = "Anduril";
	        anduril.dano = 100;
	        anduril.material = "Aço Élfico";

	        System.out.println("Nome: " + anduril.nome);
	        System.out.println("Dano: " + anduril.dano);
	        System.out.println("Material: " + anduril.material);

	        anduril.atacar();
	        anduril.afiar();

	    }

	}