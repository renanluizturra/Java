package prova;

//Classe pai/base — representa qualquer obra no catálogo
	public class Filme {

	    // Encapsulamento: atributos privados — só acessíveis via get/set
	    private String titulo;
	    private int ano;

	    // Construtor: inicializa os atributos via parâmetros
	    public Filme(String titulo, int ano) {
	        this.titulo = titulo;
	        this.ano    = ano;
	    }

	    // Getters e Setters
	 
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		 // Método que será sobrescrito pelo Documentario (polimorfismo)
	   	    public void exibirInfo() {
	        System.out.println("Título: " + titulo + " | Ano: " + ano);
	    }

}
