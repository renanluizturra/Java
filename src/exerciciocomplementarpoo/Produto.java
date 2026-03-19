package exerciciocomplementarpoo;

import java.util.ArrayList;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	private ArrayList<Produto> lista = new ArrayList<>();
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		//criando métodos
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	public void exibirDados() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Quantidade do produto: " + quantidade);
		System.out.println("Preço do produto: " + preco);
	}
	public void adicionarProduto(String nome, double preco, int quantidade) {
		Produto novoProduto = new Produto(nome,preco, quantidade);
		lista.add(novoProduto);
			System.out.println("Produto adicionado!!! ");
	}
	public void listarProduto() {
		if(lista.isEmpty()) {
			System.out.println("Lista Vazia ");
        }else {
            System.out.println("Exibindo Produtos ");
            for(Produto total:lista) {
                System.out.println(total);
            }
        }
	}


    public void contar() {
        System.out.println("Contagem dos produtos" + lista.size());
    }
    }
    
    
        
