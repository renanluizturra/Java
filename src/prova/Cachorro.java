package prova;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Construtor do Pai
        this.raca = raca;
    }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    @Override
    public void emitirSom() {
        // Polimorfismo: O cachorro não faz som genérico, ele late!
        System.out.println("O cachorro " + getNome() + " (Raça: " + raca + ") diz: Au Au!");
    }
}