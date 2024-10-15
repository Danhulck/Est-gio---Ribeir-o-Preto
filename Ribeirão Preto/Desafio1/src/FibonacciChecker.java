// DESAFIO 1 
// Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
// IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int n) {
        //os dois primeiros números da sequência de Fibonacci:
        int a = 0, b = 1;

        // O loop continua enquanto o valor de 'b' for menor que o número informado
        while (b < n) {
            // Calcula o próximo número da sequência de Fibonacci
            int temp = b;   // Armazena temporariamente o valor de 'b'
            b = a + b;      // Atualiza 'b' somando 'a' e 'b' (o próximo número da sequência)
            a = temp;       // Atualiza 'a' com o valor anterior de 'b'
        }

        // Retorna true se o número informado for igual a 'b' (se pertencer à sequência)
        // Ou retorna true se o número informado for zero
        return b == n || n == 0;
    }

    public static void main(String[] args) {
        // Cria um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");

        // Lê o número informado pelo usuário
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci e imprime o resultado
        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}