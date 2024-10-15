//DESAFIO 3 
// Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; 
// enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

public class SomaValor {

    public static void main(String[] args) {
        // Variáveis iniciais definidas no problema
        int INDICE = 12;  
        int SOMA = 0;     
        int K = 1;        // Define K como 1 (início do loop)

        while (K < INDICE) {
            K = K + 1;       // Incrementa o valor de K em 1
            SOMA = SOMA + K; // Adiciona o valor atualizado de K à SOMA
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }
}