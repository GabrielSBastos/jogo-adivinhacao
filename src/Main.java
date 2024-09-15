import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100); // Gera um número aleatório entre 0 e 100
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tente adivinhar o número sorteado de 0 a 100, você tem 6 tentativas:");

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + "ª tentativa:");
            int tentativa = entrada.nextInt();

            if (tentativa > numero) {
                System.out.println("Você digitou um número maior que o sorteado");
            } else if (tentativa < numero) {
                System.out.println("Você digitou um menor maior que o sorteado");
            } else {
                System.out.println("Parabéns, você acertou o número sorteado!");
                break; // Encerra o loop quando o número for acertado
            }

            if (i == 6) {
                System.out.println("Que pena, você não acertou. Tentativas esgotadas. O número sorteado foi " + numero);
            }
        }
    }
}
