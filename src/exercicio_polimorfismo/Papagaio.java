package exercicio_polimorfismo;

public class Papagaio  extends Animal
{
	private String CorPenas;
	
	

	public Papagaio(String nome, int idade, double peso, String corPenas) {
		super(nome, idade, peso);
		CorPenas = corPenas;
	}

	public String getCorPenas() {
		return CorPenas;
	}

	public void setCorPenas(String corPenas) {
		CorPenas = corPenas;
	}
	 @Override
	    public void emitirSom() {
	        System.out.println(nome + " Olá, quero biscoito");
	    }

	    @Override
	    public String getTipoAlimento() {
	        return "Onivoro - Sementes e frutas";
	    }

}


