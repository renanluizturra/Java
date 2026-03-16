package ExercíciosPoo;

public class Exercicio_5main {

	public static void main(String[] args) {
		   Exercicio_5 curaSuprema = new Exercicio_5();

	        curaSuprema.tipo = "Cura";
	        curaSuprema.potencia = 50;
	        curaSuprema.quantidade = 3;

	        System.out.println("Tipo: " + curaSuprema.tipo);
	        System.out.println("Potência: " + curaSuprema.potencia);
	        System.out.println("Quantidade: " + curaSuprema.quantidade);

	        curaSuprema.usar();
	        curaSuprema.recarregar();

	    }

	}