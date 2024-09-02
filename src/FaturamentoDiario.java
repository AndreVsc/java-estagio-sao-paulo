import java.util.List;

public class FaturamentoDiario {
    public void calcularFaturamento() {
        List<Double> faturamentos = List.of(2000.0, 0.0, 2500.0, 1800.0, 0.0, 0.0, 2700.0, 3000.0, 0.0, 2300.0);
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (double faturamento : faturamentos) {
            if (faturamento > 0) {
                if (faturamento < menorValor) {
                    menorValor = faturamento;
                }
                if (faturamento > maiorValor) {
                    maiorValor = faturamento;
                }
                soma += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (double faturamento : faturamentos) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Exercício 3 - Menor valor de faturamento: " + menorValor);
        System.out.println("Exercício 3 - Maior valor de faturamento: " + maiorValor);
        System.out.println("Exercício 3 - Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}