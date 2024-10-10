import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 /*
    1)
    // int INDICE = 13, SOMA = 0, K = 0;
    //Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
    //Imprimir(SOMA);
    int indice = 13, SOMA = 0, K = 0;
 while (K<indice) {
     K = K+1;
     SOMA = SOMA + K;
 }
    System.out.print("SOMA = "+SOMA);
 */
/*
    2)
    // inicia por 0 e 1
    // próximo valor sempre será a soma dos 2 valores anteriores
    // calcule a sequência de Fibonacci
    // retorne se o numero informado pertence ou nao a sequencia
    System.out.println("Digite um número:");
    int num = scanner.nextInt();

    if (isFibonacci(num)) {
        System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
    }

    scanner.close();
}

// Função que verifica se o número pertence à sequência de Fibonacci
public static boolean isFibonacci(int num) {
    if (num == 0 || num == 1) {
        return true;
    }

    int a = 0;
    int b = 1;
    int fibonacci = a + b;

    while (fibonacci <= num) {
        if (fibonacci == num) {
            return true;  // Se o número é encontrado na sequência, retorna verdadeiro
        }
        a = b;
        b = fibonacci;
        fibonacci = a + b;
    }

    return false;  // Se o número não é encontrado, retorna falso
 */
    /*
    3)
    // Dado um vetor
    // guarda o valor de faturamento diário. PRECISA
    // O menor e o maior valor de faturamento ocorrido em um dia do mês
    // Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

    // Definindo o número de dias no mês
    System.out.print("Informe o número de dias no mês: ");
    int diasNoMes = scanner.nextInt();

    double[] faturamento = new double[diasNoMes];
    double somaFaturamento = 0;

    // Coletando os valores de faturamento diário
    for (int i = 0; i < diasNoMes; i++) {
        System.out.print("Informe o faturamento do dia " + (i + 1) + ": ");
        faturamento[i] = scanner.nextDouble();
        somaFaturamento += faturamento[i];
    }

    // Calculando o menor e o maior valor de faturamento
    double menorFaturamento = faturamento[0];
    double maiorFaturamento = faturamento[0];

    for (int i = 1; i < diasNoMes; i++) {
        if (faturamento[i] < menorFaturamento) {
            menorFaturamento = faturamento[i];
        }
        if (faturamento[i] > maiorFaturamento) {
            maiorFaturamento = faturamento[i];
        }
    }

    // Calculando a média mensal
    double mediaMensal = somaFaturamento / diasNoMes;

    // Contando os dias com faturamento superior à média
    int diasAcimaDaMedia = 0;
    for (int i = 0; i < diasNoMes; i++) {
        if (faturamento[i] > mediaMensal) {
            diasAcimaDaMedia++;
        }
    }

    // Exibindo os resultados
    System.out.println("\nMenor valor de faturamento: " + menorFaturamento);
    System.out.println("Maior valor de faturamento: " + maiorFaturamento);
    System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
*/
    /*
    4)
    //Dado o valor mensal,detalhado por estado
    //calcule o percentual,  cada estado teve dentro do valor total mensal

// Valores de faturamento por estado
    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    // Calcula o valor total de faturamento
    double total = sp + rj + mg + es + outros;

    // Calcula o percentual de cada estado
    double percSP = (sp / total) * 100;
    double percRJ = (rj / total) * 100;
    double percMG = (mg / total) * 100;
    double percES = (es / total) * 100;
    double percOutros = (outros / total) * 100;

    // Exibe os percentuais de cada estado
    System.out.printf("Percentual de representação por estado:\n");
    System.out.printf("SP: %.2f%%\n", percSP);
    System.out.printf("RJ: %.2f%%\n", percRJ);
    System.out.printf("MG: %.2f%%\n", percMG);
    System.out.printf("ES: %.2f%%\n", percES);
    System.out.printf("Outros: %.2f%%\n", percOutros);
*/
}