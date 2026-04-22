package prova;

public class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // Getters e Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    // Método que será sobrescrito (Polimorfismo)
    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + " | Modelo: " + modelo);
    }
}