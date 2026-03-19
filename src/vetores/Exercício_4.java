package vetores;

public class Exercício_4 {

    public static void main(String[] args) {

        int[] numeros = {4, 7, 10, 3, 8, 5}; // 6 números pré-definidos
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // verifica se é par
                soma += numeros[i];
            }
        }

        System.out.println("Soma dos números pares: " + soma);
    }
}