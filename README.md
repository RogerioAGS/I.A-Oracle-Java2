Seção 1 - Exercício 1 - Tipos de Dados Java
Objetivo:
Familiarizar-se com a sintaxe de declaração (tipo nome;) e inicialização (nome = valor;) dos principais tipos de dados em Java: int, double, boolean e String.
Código de Início (Template)
Complete as seções // TODO: na classe principal.
Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 1: Tipos de Dados ---");
        
        // 1. Tipo Inteiro (int): Para números inteiros (contagem de features, IDs).
        int numeroDeModelos;
        
        // 2. Tipo Decimal (double): Para valores com precisão (Entropia, métricas).
        double valorDaEntropia; 
        
        // 3. Tipo Booleano (boolean): Para lógica (checar se um nó é folha, se o dado é válido).
        boolean isTreinamentoConcluido; 
        
        // 4. Tipo String: Para textos (rótulos de features, nomes de classes).
        String versaoDoSDK; 
        
        // ------------------------------------------------------------------
        
        // TODO: Inicialize a variável 'numeroDeModelos' com um valor inteiro (e.g., 5)
        
        
        // TODO: Inicialize a variável 'valorDaEntropia' com um valor decimal (e.g., 0.98)
        
        
        // TODO: Inicialize a variável 'isTreinamentoConcluido' com 'true' ou 'false'
        
        
        // TODO: Inicialize a variável 'versaoDoSDK' com um texto (e.g., "oci-sdk-v1.0")
        
        
        // ------------------------------------------------------------------
        
        System.out.println("\n--- Valores das Variáveis ---");
        
        // TODO: Use System.out.println() para imprimir o valor de cada uma das quatro variáveis:   
        
    }
}

Resolução
Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 1: Tipos de Dados ---");
        
        // 1. Tipo Inteiro (int)
        int numeroDeModelos;
        
        // 2. Tipo Decimal (double)
        double valorDaEntropia; 
        
        // 3. Tipo Booleano (boolean)
        boolean isTreinamentoConcluido; 
        
        // 4. Tipo String
        String versaoDoSDK; 
        
        // ------------------------------------------------------------------
        
        // TODO: Inicialize a variável 'numeroDeModelos' com um valor inteiro (e.g., 5)
        numeroDeModelos = 3;
        
        // TODO: Inicialize a variável 'valorDaEntropia' com um valor decimal (e.g., 0.98)
        valorDaEntropia = 0.925; 
        
        // TODO: Inicialize a variável 'isTreinamentoConcluido' com 'true' ou 'false'
        isTreinamentoConcluido = true; 
        
        // TODO: Inicialize a variável 'versaoDoSDK' com um texto (e.g., "oci-sdk-v1.0")
        versaoDoSDK = "oci-ai-language-v2.0";
        
        
        // ------------------------------------------------------------------
        
        System.out.println("\n--- Valores das Variáveis ---");
        
        // TODO: Use System.out.println() para imprimir o valor de cada uma das quatro variáveis:
        System.out.println("Número de Modelos no Projeto: " + numeroDeModelos);
        System.out.println("Entropia Máxima Calculada: " + valorDaEntropia);
        System.out.println("Status do Treinamento: " + isTreinamentoConcluido);
        System.out.println("Versão do SDK da Oracle: " + versaoDoSDK);
        
    }
}
# I.A-Oracle-Java2
