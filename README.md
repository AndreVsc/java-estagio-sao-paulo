# Projeto de Exercícios de Programação

Este projeto contém uma série de exercícios de programação em Java, organizados em diferentes classes. Cada exercício aborda um problema específico e fornece uma solução implementada em Java.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/main/java/andrevsc/constants**: Contém a classe `Constants` que exibe as descrições dos exercícios.
- **src/main/java/andrevsc/quests**: Contém as classes que implementam as soluções dos exercícios.
  - `FaturamentoDiario.java`: Calcula o menor, maior valor de faturamento diário e o número de dias com faturamento acima da média.
  - `Fibonacci.java`: Verifica se um número pertence à sequência de Fibonacci.
  - `InversaoString.java`: Inverte uma string.
  - `PercentualFaturamento.java`: Calcula o percentual de faturamento de diferentes estados.
  - `SomaLaco.java`: Calcula a soma de uma sequência de números.
  - `Faturamento.java`: Classe auxiliar usada por `FaturamentoDiario.java`.
- **src/main/java/andrevsc**: Contém a classe principal `App.java` que executa todos os exercícios.
- **src/main/resources**: Contém o arquivo `dados.json` com os dados de faturamento diário.

## Como Usar

### Pré-requisitos

- Java Development Kit (JDK) instalado.
- Apache Maven instalado.
- Um ambiente de desenvolvimento integrado (IDE) como o Visual Studio Code ou IntelliJ IDEA.

### Compilação e Execução

1. Clone o repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Compile o projeto usando o Maven com o comando:

```powershell
    mvn clean compile
```

4.Execute o projeto usando o comando:

```powershell
    mvn clean compile exec:java
```
## Caso Não Seja Possível Compilar o Código

Se você encontrar problemas ao compilar o código, verifique os seguintes pontos:

- Certifique-se de que o JDK está corretamente instalado e configurado no seu PATH.
- Verifique se o Maven está corretamente instalado e configurado no seu PATH.
- Verifique se o diretório `src` contém todos os arquivos `.java` necessários.
- Certifique-se de que você está executando os comandos de compilação e execução no diretório correto.

Se os problemas persistirem, consulte a documentação do JDK ou do Maven, ou procure ajuda em fóruns de programação.

## Exercícios

### Exercício 1

Calcula a soma de uma sequência de números.

### Exercício 2

Verifica se um número pertence à sequência de Fibonacci.

### Exercício 3

Calcula o menor, maior valor de faturamento diário e o número de dias com faturamento acima da média.

### Exercício 4

Calcula o percentual de faturamento de diferentes estados.

### Exercício 5

Inverte uma string.

## Contato

Para mais informações ou dúvidas, entre em contato com o desenvolvedor do projeto.

---

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

Andre-Victor-Castro
