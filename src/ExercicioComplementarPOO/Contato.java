package ExercicioComplementarPOO;

import java.util.ArrayList;

public class Contato {

    private String nome;
    private String telefone;

    private ArrayList<Contato> contatos = new ArrayList<>();

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("--------------------");
    }

    // ADICIONAR
    public void adicionar(String nome, String telefone) {

        Contato novo = new Contato(nome, telefone);
        contatos.add(novo);

        System.out.println("Contato adicionado!");
    }

    // LISTAR
    public void listar() {

        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }

        for (Contato c : contatos) {
            c.exibirDados();
        }
    }

    // BUSCAR
    public void buscarNome(String nomeBusca) {

        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }

        boolean encontrou = false;

        for (Contato c : contatos) {

            if (c.getNome().equalsIgnoreCase(nomeBusca)) {

                System.out.println("Contato encontrado:");
                c.exibirDados();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Contato não encontrado.");
        }
    }

    // REMOVER
    public void remover(String nomeBusca) {

        for (Contato c : contatos) {

            if (c.getNome().equalsIgnoreCase(nomeBusca)) {

                contatos.remove(c);
                System.out.println("Contato removido!");
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }
}