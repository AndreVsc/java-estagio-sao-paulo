package andrevsc.quests;
import java.util.Scanner;

public class InversaoString {
    private String original = "teste";
    private String invertida = "";

    public void inverterString(Scanner scanner) {  
        System.out.print("\nPalavra original : " + original);
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("\nPalavra invertida: " + invertida);
    }
}