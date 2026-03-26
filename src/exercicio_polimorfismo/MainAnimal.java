package exercicio_polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("MENU PRINCIPAL ");
				System.out.println("1 - Adicionar Leão ");
				System.out.println("2 - Adicionar Elefante ");
				System.out.println("3 - Adicionar Papagaio ");
				System.out.println("4 - Listar todos os animais ");
				System.out.println("5 - Fazer todos os animais emitirem som ");
				System.out.println("6 - Mostrar a dieta de todos");
				System.out.println("0 - Sair");
			
				System.out.println("Escolha uma opção: ");
				
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			 case 1:
                 System.out.print("Nome: ");
                 String nomeL = sc.nextLine();
                 System.out.print("Idade: ");
                 int idadeL = sc.nextInt();
                 System.out.print("Peso: ");
                 double pesoL = sc.nextDouble();
                 animais.add(new Leao(nomeL, idadeL, pesoL));
                 
                 System.out.println("Leão Adicionado no zoologico");
                 break;

             case 2:
                 System.out.print("Nome: ");
                 String nomeE = sc.nextLine();
                 System.out.print("Idade: ");
                 int idadeE = sc.nextInt();
                 System.out.print("Peso: ");
                 double pesoE = sc.nextDouble();
                 System.out.print("Comprimento da tromba: ");
                 double comp = sc.nextDouble();
                 animais.add(new Elefante(nomeE, idadeE, pesoE, comp));
                 System.out.println("Elefante Adicionado no zoologico");
                 break;

             case 3:
                 System.out.print("Nome: ");
                 String nomeP = sc.nextLine();
                 System.out.print("Idade: ");
                 int idadeP = sc.nextInt();
                 System.out.print("Peso: ");
                 double pesoP = sc.nextDouble();
                 sc.nextLine();
                 System.out.print("Cor das penas: ");
                 String cor = sc.nextLine();
                 animais.add(new Papagaio(nomeP, idadeP, pesoP, cor));
                 System.out.println("Papagaio adicionado no zoologico");
                 break;

             case 4:
                 System.out.println("\n=== LISTA DE ANIMAIS ===");
                 for (Animal a : animais) {
                     a.exibirInfo();
                     System.out.println("-------------------");
                 }
                 break;

             case 5:
                 System.out.println("\n═══ ANIMAIS EMITINDO SOM ═══");
                 for (Animal a : animais) {
                     a.emitirSom();
                 }
                 break;

             case 6:
                 System.out.println("\n═══ DIETA DOS ANIMAIS ═══");
                 for (Animal a : animais) {
                     System.out.println(a.nome + ": " + a.getTipoAlimento());
                 }
                 break;

             case 0:
                 System.out.println("Encerrando...");
                 break;

             default:
                 System.out.println("Opção inválida!");
				

	}

}while (opcao != 0);
	    
	    sc.close();
	}
}
