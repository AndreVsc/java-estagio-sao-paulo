import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        SomaLaco somaLaco = new SomaLaco();
        somaLaco.calcularSoma();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.verificarFibonacci(scanner);

        FaturamentoDiario faturamentoDiario = new FaturamentoDiario();
        faturamentoDiario.calcularFaturamento();

        PercentualFaturamento percentualFaturamento = new PercentualFaturamento();
        percentualFaturamento.calcularPercentual();

        InversaoString inversaoString = new InversaoString();
        inversaoString.inverterString(scanner);

        scanner.close();
    }
}