package prova;

public class Documentario extends Filme{
	
	 // Atributo específico da classe filha
   private String tema;

   // Construtor chama super() para inicializar atributos da classe pai
   public Documentario(String titulo, int ano, String tema) {
       super(titulo, ano);  // delega para Filme(titulo, ano)
       this.tema = tema;
   }

   // Getter e Setter para o atributo específico

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	  // Polimorfismo: @Override substitui o exibirInfo() do pai
   // Usa getTitulo() e getAno() porque titulo e ano são PRIVADOS no pai
   @Override
   public void exibirInfo() {
       System.out.println("Título: " + getTitulo()
                        + " | Ano: " + getAno()
                        + " | Tema: " + tema);
   }
	

}
