package exercício_encapsulamento;

import java.util.Scanner;

public class Exercicio_4main {

	  public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);

		    System.out.print("Digite o modelo do carro: ");
		    String modelo = sc.nextLine();

		    System.out.print("Digite o ano do carro: ");
		    int ano = sc.nextInt();

		    Exercicio_4 carro = new Exercicio_4(modelo, ano, 0);

		    System.out.print("Quanto deseja acelerar? ");
		    double acelerar = sc.nextDouble();
		    carro.acelerar(acelerar);

		    System.out.print("Quanto deseja frear? ");
		    double frear = sc.nextDouble();
		    carro.frear(frear);

		    carro.mostrarVelocidade();

		    sc.close();
		    }
		}