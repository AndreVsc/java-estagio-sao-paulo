public class SomaLaco {
    public void calcularSoma() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("\n1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;\r\n" + //
                        "Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }\r\n" + //
                        "Imprimir(SOMA);\r\n" + //
                        "Ao final do processamento, qual será o valor da variável SOMA?\n");
        System.out.println("Resultado: " + SOMA+" \n");
    }
}