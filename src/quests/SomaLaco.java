package quests;
public class SomaLaco {
    private int INDICE = 13;
    private int SOMA = 0;
    private int K = 0;
    public void calcularSoma() {
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Resultado: " + SOMA);
    }
}