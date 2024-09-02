import java.util.Scanner;

public class InversaoString {
    public void inverterString(Scanner scanner) {
        System.out.print("Exercício 5 - Digite uma string para ser invertida: ");
        String original = scanner.nextLine();
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("Exercício 5 - String invertida: " + invertida);
    }
}