package heranca;

import java.util.Scanner;

public class Veiculomain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==CADASTRO DE CARRO==");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Quantidade de portas: ");
		int qtdPortas = sc.nextInt();
		sc.nextLine();
		
		Carro CIVIC = new Carro(marca, modelo, ano, qtdPortas);
		
		System.out.println("==CADASTRO DE MOTO==");
		System.out.println("Marca: ");
		marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		ano = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cilindrads: ");
		int cilindradas = sc.nextInt();
		
		Moto CG = new Moto (marca, modelo, ano, cilindradas);
		
		CIVIC.exibirDados();
		CG.exibirDados();
		
		

	}

}
