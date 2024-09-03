package quests;
public class PercentualFaturamento {
    private double sp = 67836.43;
    private double rj = 36678.66;
    private double mg = 29229.88;
    private double es = 27165.48;
    private double outros = 19849.53;

    public void calcularPercentual() {
        double total = sp + rj + mg + es + outros;
        System.out.printf("\nSP  R$67.836,43 | Percentual de SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("RJ  R$36.678,66 | Percentual de RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("MG  R$29.229,88 | Percentual de MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("ES  R$27.165,48 | Percentual de ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Ot  R$19.849,53 | Percentual de Outros: %.2f%%\n", (outros / total) * 100);
    }
}