package polimorfismo;

public class Leao extends Animal {
	
	

    public Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: ROARRR!");
    }

    @Override
    public String getTipoAlimento() {
        return "Carnívoro - Carne";
    }

    public void rugir() {
        System.out.println(nome + " está rugindo ferozmente!");
    }
}
