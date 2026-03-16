package Vetores;

public class Exemplo {

	public static void main(String[] args) {
		System.out.println("==Vetor==");
		
		//declarar vetor
		int[] numeros = {40, 15, 70, 5, 30, 80};
		
		//percorrer o vetor
		//length vai pegar o tamanho do vetor
		for(int i= 0; i< numeros.length; i++) {
			System.out.println("Números["+ i +"]= " + numeros[i]);
			
		}

	}

}
