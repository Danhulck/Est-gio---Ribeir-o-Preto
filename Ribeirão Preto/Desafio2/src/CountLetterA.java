// DESAFIO 2 
// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
// seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class CountLetterA {

    // Função para contar quantas vezes 'a' (maiúsculo ou minúsculo) aparece na string
    public static int countA(String str) {
        
        int count = 0;  // Variável para contar as ocorrências de 'a'
        
        // Loop que percorre cada caractere da string
        for (int i = 0; i < str.length(); i++) {

            // Converte o caractere atual para minúsculo
            char ch = Character.toLowerCase(str.charAt(i));

            // Verifica se o caractere é 'a' e incrementa o contador
            if (ch == 'a') {
                count++;
            }
        }

        // Retorna o número total de ocorrências da letra 'a'
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        
        String texto = scanner.nextLine();

        int quantidade = countA(texto);

        System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");

        scanner.close();
    }
}