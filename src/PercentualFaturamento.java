public class PercentualFaturamento {
    public void calcularPercentual() {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.printf("Exercício 4 - Percentual de SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("Exercício 4 - Percentual de RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("Exercício 4 - Percentual de MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("Exercício 4 - Percentual de ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Exercício 4 - Percentual de Outros: %.2f%%\n", (outros / total) * 100);
    }
}