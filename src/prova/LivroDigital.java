package prova;


public class LivroDigital extends Livro {
    private String formato; // Ex: PDF, Kindle, EPUB

    public LivroDigital(String titulo, String autor, String formato) {
        super(titulo, autor); // Chama o construtor da classe Livro
        this.formato = formato;
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public void exibirDados() {
        // Polimorfismo: personaliza a exibição mantendo o acesso aos dados do pai
        System.out.println("Título: " + getTitulo() + 
                           " | Autor: " + getAutor() + 
                           " | Formato: [" + formato + "]");
    }
}