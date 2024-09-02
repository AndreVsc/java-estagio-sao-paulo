import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        SomaLaco somaLaco = new SomaLaco();
        somaLaco.calcularSoma();

        // Exercicio 2
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.verificarFibonacci(scanner);

        // Exercicio 3
        FaturamentoDiario faturamentoDiario = new FaturamentoDiario();
        faturamentoDiario.calcularFaturamento();

        PercentualFaturamento percentualFaturamento = new PercentualFaturamento();
        percentualFaturamento.calcularPercentual();

        InversaoString inversaoString = new InversaoString();
        inversaoString.inverterString(scanner);

        scanner.close();
    }
}