import java.util.Scanner;

public class InversaoString {
    public void inverterString(Scanner scanner) {
        String original = "teste";
        String invertida = "";
        System.out.print("\n5) Escreva um programa que inverta os caracteres de um string.\r\n");
        System.out.print("\nPalavra original : " + original);
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        System.out.println("\nPalavra invertida: " + invertida);
    }
}