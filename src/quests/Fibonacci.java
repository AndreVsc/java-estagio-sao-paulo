package quests;
import java.util.Scanner;

public class Fibonacci {
    private int numero;
    public void verificarFibonacci(Scanner scanner) {
        int numerocaneado = scanner.nextInt();
        setNumero(numerocaneado);
        scanner.nextLine();
        int a = 0, b = 1, c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero || numero == 0) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}