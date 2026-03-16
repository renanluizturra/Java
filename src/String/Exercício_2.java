package String;

import java.util.Scanner;

public class Exercício_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário e senha cadastrados
        String usuarioCorreto = "turra";
        String senhaCorreta = "777157";

        // Entrada do usuário
        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        // Validações
        if (usuario.equalsIgnoreCase(usuarioCorreto) 
                && senha.equals(senhaCorreta) 
                && senha.length() >= 6) {

            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
}