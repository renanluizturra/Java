package exemplopoo;

public class Motorista {

	String nome;
	String placa;
	boolean disponivel;
	
	void aceitarCorrida() {
		if(disponivel) {
			System.out.println(nome + "aceitou a corrida. ");
			disponivel = false;
			
		}else {
			System.out.println("Motorista indisponível.");
		}
	}
}
