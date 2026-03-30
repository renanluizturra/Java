package abstracao;

public class AnimalMain {

	public static void main(String[] args) {

		Animal dog = new Cachorro ("Teddy");
		Animal cat = new Gato ("Bilibio");
		
		dog.fazerSom();
		cat.fazerSom();
		dog.dormir();
		

	}

}
