import java.util.Scanner;

public class Fibonacci {
    public void verificarFibonacci(Scanner scanner) {
        System.out.print("2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre \r\n" + //
                        " será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), \r\n" + //
                        " escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência \r\n" + //
                        " de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.\n");
        System.out.print("\nInforme um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
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
}