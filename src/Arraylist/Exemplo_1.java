package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Exemplo_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//criando Arraylist
		ArrayList<Integer> notas = new ArrayList<>();
		
		//Adicionar elementos .add
		System.out.println("Digite 3 notas: (Inteiro)");
		
		for(int i=0; i<3; i++) {
			System.out.println("Nota: "+ (i +1) + ":");
			//entrada
			int valorDigitado = sc.nextInt();
			notas.add(valorDigitado); ;//adicionando no array
			
		}
		System.out.println("Lista atual: " + notas);
		
		//Acessando os elemento .get
		System.out.println("\n Primeira nota digitada: " +notas.get(0));
		
		//Modificando/Atualizando .set
		System.out.println("\n Digite uma nova nota");
		int novaNota = sc.nextInt();
		notas.set(0, novaNota);
		
		System.out.println("A lista atual: " + notas);
	}

}
