package prova;

public class Caminhao extends Veiculo {
    private double capacidadeCarga; // Atributo específico

    public Caminhao(String placa, String modelo, double capacidadeCarga) {
        super(placa, modelo); // Chama o construtor do pai
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

    @Override
    public void exibirDetalhes() {
        // Usa os getters do pai pois placa/modelo são privados lá
        System.out.println("Placa: " + getPlaca() + 
                           " | Modelo: " + getModelo() + 
                           " | Carga: " + capacidadeCarga + " Toneladas");
    }
}