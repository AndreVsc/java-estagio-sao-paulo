import java.util.Scanner;

import constants.Constants;
import quests.FaturamentoDiario;
import quests.Fibonacci;
import quests.InversaoString;
import quests.PercentualFaturamento;
import quests.SomaLaco;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Constants questions = new Constants();

        // Exercicio 1

        questions.exercicio1();
        SomaLaco somaLaco = new SomaLaco();
        somaLaco.calcularSoma();
        questions.separation();
        
        // Exercicio 2
        questions.exercicio2();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.verificarFibonacci(scanner);
        questions.separation();
        
        // Exercicio 3
        questions.exercicio3();
        FaturamentoDiario faturamentoDiario = new FaturamentoDiario();
        faturamentoDiario.calcularFaturamento();
        questions.separation();
        
        // Exercicio 4
        questions.exercicio4();
        PercentualFaturamento percentualFaturamento = new PercentualFaturamento();
        percentualFaturamento.calcularPercentual();
        questions.separation();
        
        // Exercicio 5
        questions.exercicio5();
        InversaoString inversaoString = new InversaoString();
        inversaoString.inverterString(scanner);
        questions.separation();

        scanner.close();
    }
}