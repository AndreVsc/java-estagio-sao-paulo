package quests;
public class SomaLaco {
    public void calcularSoma() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Resultado: " + SOMA);
    }
}