/*
 * ==============================================================================
 * OBJETIVO DO PROGRAMA: CONVERSOR DE TEMPERATURA
 * ==============================================================================
 * Este programa tem como objetivo ler uma temperatura fornecida pelo usuário
 * na escala Celsius (°C), garantir que a entrada seja tratada como um número
 * decimal (double) e convertê-la para a escala Fahrenheit (°F) usando a
 * fórmula matemática: F = C * 1.8 + 32.
 * Ele integra a entrada de dados (Scanner), conversão de tipos e cálculo.
 */

import java.util.Scanner; // 1. PRÉ-REQUISITO: Importa a classe Scanner do pacote java.util para permitir a leitura de dados do console.

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Desafio 1: Conversor de Celsius para Fahrenheit ---");
        
        // Crie o objeto Scanner para ler a entrada do usuário
        // 2. CRIAÇÃO DO SCANNER: Inicializa o objeto Scanner, configurando-o para ler dados do fluxo de entrada padrão (System.in), que é o teclado.
        Scanner scanner = new Scanner(System.in);
        
        
        // Variável para armazenar a temperatura em Celsius
        // 3. DECLARAÇÃO: Usamos 'double' para garantir que a temperatura possa ser um número decimal (ponto flutuante), o que é essencial para medições precisas.
        double celsius;
        
        // Variável para armazenar a temperatura convertida em Fahrenheit
        double fahrenheit;
        
        // ------------------------------------------------------------------
        
        System.out.print("Digite a temperatura em Celsius (°C): "); // Pede a entrada ao usuário. Usa 'print' para manter o cursor na mesma linha.
        
        // 4. LEITURA DA ENTRADA: O método nextDouble() lê o próximo valor inserido pelo usuário como um 'double', atendendo ao requisito de tipo de dado.
        celsius = scanner.nextDouble();
        
        
        // 5. CÁLCULO MATEMÁTICO: Aplica a fórmula de conversão: F = C * 1.8 + 32.
        // O Java respeita a ordem das operações (multiplicação antes da adição).
        fahrenheit = celsius * 1.8 + 32;
        
        
        // 6. IMPRESSÃO DO RESULTADO: Exibe o resultado de forma clara.
        // String.format("%.1f", ...) é usado para formatar os valores 'double' com apenas uma casa decimal, melhorando a legibilidade.
        System.out.println(String.format("%.1f °C equivalem a %.1f °F", celsius, fahrenheit));
        
        
        // 7. FECHAMENTO DO RECURSO (BOA PRÁTICA): Fecha o objeto Scanner para liberar recursos do sistema que foram abertos.
        // É crucial para evitar vazamentos de recursos em aplicações maiores.
        scanner.close();
        
        
        // ------------------------------------------------------------------
    }
}