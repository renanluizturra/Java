package ExercíciosPoo;

public class Exercicio_6main {

	public static void main(String[] args) {

        Exercicio_6 tonyStarkPhone = new Exercicio_6();

        tonyStarkPhone.modelo = "StarkPhone X";
        tonyStarkPhone.armazenamento = 512;
        tonyStarkPhone.ligado = false;

        tonyStarkPhone.mostrarInfo();

        tonyStarkPhone.ligar();
        tonyStarkPhone.mostrarInfo();

        tonyStarkPhone.desligar();
        tonyStarkPhone.mostrarInfo();

    }

}