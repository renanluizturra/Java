package prova;

		import java.util.ArrayList;
		import java.util.Scanner;

		public class CatalogoFilmesMain {

		    public static void main(String[] args) {

		        // Lista do tipo PAI → aceita Filme e Documentario (polimorfismo)
		        ArrayList<Filme> catalogo = new ArrayList<>();
		        
		        Scanner sc = new Scanner(System.in);
		        int opcao;

		        // do-while garante que o menu seja exibido pelo menos uma vez
		        do {
		            System.out.println("\n=== CATÁLOGO DE FILMES ===");
		            System.out.println("1. Adicionar obra (Filme ou Documentário)");
		            System.out.println("2. Ver catálogo completo");
		            System.out.println("3. Buscar obra por título");
		            System.out.println("4. Remover obra");
		            System.out.println("5. Sair");
		            System.out.print("Escolha: ");

		            opcao = sc.nextInt();
		            sc.nextLine();

		            switch (opcao) {

		                // ─── OPÇÃO 1: Adicionar ───────────────────────────────────────
		                case 1:
		                    System.out.print("Adicionar: (1) Filme comum ou (2) Documentário? ");
		                    int tipo = sc.nextInt();
		                    sc.nextLine();

		                    System.out.print("Título: ");
		                    String titulo = sc.nextLine();
		                    
		                    System.out.print("Ano: ");
		                    int ano = sc.nextInt();
		                    sc.nextLine();

		                    if (tipo == 1) {
		                    	
		                    	Filme filmes = new Filme(titulo, ano);
		                    	
		                        catalogo.add(filmes);
		                        System.out.println("Filme adicionado com sucesso!");
		                        
		                    } else if (tipo == 2) {
		                    	
		                        System.out.print("Tema: ");
		                        String tema = sc.nextLine();
		                        
		                        Documentario docs = new Documentario(titulo, ano, tema);
		                        catalogo.add(docs);
		                       // catalogo.add(new Documentario(titulo, ano, tema));
		                        
		                        System.out.println("Documentário adicionado com sucesso!");
		                    } else {
		                        System.out.println("Tipo inválido!");
		                    }
		                    break;

		                // ─── OPÇÃO 2: Listar ──────────────────────────────────────────
		                case 2:
		                    if (catalogo.isEmpty()) {
		                        System.out.println("Seu catálogo está vazio.");
		                    } else {
		                        // Polimorfismo: f.exibirInfo() chama versão correta
		                        //    automaticamente (Filme ou Documentario)
		                        for (int i = 0; i < catalogo.size(); i++) {
		                            System.out.print((i + 1) + ". ");
		                            catalogo.get(i).exibirInfo();
		                        }
		                        System.out.println("Total: " + catalogo.size() + " item(ns).");
		                    }
		                    break;

		                // ─── OPÇÃO 3: Buscar ──────────────────────────────────────────
		                case 3:
		                    System.out.print("Trecho do título a buscar: ");
		                    String textoBuscado = sc.nextLine();
		                    boolean encontrado = false;

		                    for (Filme f : catalogo) {
		                        //contains() busca trecho — mais flexível que equals()
		                        if (f.getTitulo().toLowerCase().contains(textoBuscado.toLowerCase())) {
		                            f.exibirInfo();  // polimórfico
		                            encontrado = true;
		                        }
		                    }
		                    if (!encontrado)
		                        System.out.println("Obra não encontrada no catálogo.");
		                    break;

		                // ─── OPÇÃO 4: Remover ─────────────────────────────────────────
		                case 4:
		                    if (catalogo.isEmpty()) {
		                        System.out.println("Catálogo vazio, nada para remover.");
		                        break;
		                    }
		                    // Lista os itens numerados (1, 2, 3...)
		                    for (int i = 0; i < catalogo.size(); i++) {
		                        System.out.print((i + 1) + ". ");
		                        catalogo.get(i).exibirInfo();
		                    }
		                    System.out.print("Número do item a remover: ");
		                    int numero = sc.nextInt();
		                    sc.nextLine();

		                    //Valida: número deve estar entre 1 e o tamanho da lista
		                    if (numero >= 1 && numero <= catalogo.size()) {
		                        Filme removido = catalogo.remove(numero - 1);
		                        System.out.println("Obra '" + removido.getTitulo() + "' removida.");
		                    } else {
		                        System.out.println("Número inválido!");
		                    }
		                    break;

		                case 5:
		                    System.out.println("Encerrando sistema. Até logo!");
		                    break;

		                default:
		                    System.out.println("Opção inválida! Digite de 1 a 5.");
		            }

		        } while (opcao != 5);

		        sc.close();

	}

}
