package quests;
import java.util.List;

public class FaturamentoDiario {
    private List<Double> faturamentos = List.of(2000.0, 0.0, 2500.0, 1800.0, 0.0, 0.0, 2700.0, 3000.0, 0.0, 2300.0);
    private double menorValor = Double.MAX_VALUE;
    private double maiorValor = Double.MIN_VALUE;
    private double soma = 0;
    private int diasComFaturamento = 0;

    public void calcularFaturamento() {
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
        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia + "\n");
    }
}