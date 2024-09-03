package andrevsc.quests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FaturamentoDiario {

    private List<Faturamento> faturamentos;

    public FaturamentoDiario() {
        carregarDados();
    }

    private void carregarDados() {
        String caminhoArquivo = "src/main/java/andrevsc/data/dados.json";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            // Usando Gson para fazer o parsing do JSON
            Gson gson = new Gson();
            Type faturamentoListType = new TypeToken<List<Faturamento>>() {}.getType();
            faturamentos = gson.fromJson(reader, faturamentoListType);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void calcularFaturamento() {
        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        // Processando os valores
        for (Faturamento faturamento : faturamentos) {
            double valor = faturamento.getValor();
            if (valor > 0) {
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                soma += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        // Contando dias com faturamento acima da média
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}
