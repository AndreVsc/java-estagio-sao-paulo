import java.util.Scanner;

public class Fibonacci {
    public void verificarFibonacci(Scanner scanner) {
        System.out.print("Exercício 2 - Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        int a = 0, b = 1, c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero || numero == 0) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}