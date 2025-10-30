# I.A-Oracle-Java2

#Seção 1 - Exercício 1 - Tipos de Dados Java
#Objetivo:
#Familiarizar-se com a sintaxe de declaração (tipo nome;) e inicialização (nome = valor;) dos principais tipos de dados em Java: int, double, boolean e String.
#Código de Início (Template)
#Complete as seções // TODO: na classe principal.
#Java
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

#Resolução
#Java
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

#Exercício 2 - Lógica Condicional
#Objetivo:
#Praticar a declaração de variáveis double e o uso das estruturas de controle de fluxo if e else (e, opcionalmente, else if) para tomar decisões no código.
#Código de Início (Template)
#Complete a lógica condicional na seção // TODO:.
#Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 2: Lógica Condicional ---");
        
        // Variável que simula a leitura de um sensor de temperatura (em Celsius)
        // O tipo 'double' é usado para permitir valores decimais.
        double temperaturaAtual = 18.0; 
        
        System.out.println("Temperatura Atual Registrada: " + temperaturaAtual + "°C");
        
        // ------------------------------------------------------------------
        
        // TODO: Implemente a lógica de controle de temperatura usando if/else if/else
        
        if (temperaturaAtual < 15.0) {
            // Se a temperatura for abaixo de 15°C
            System.out.println("RECOMENDAÇÃO: Ligar Aquecedor");
        } 
        
        // TODO: Adicione a condição para Ligar Ar-Condicionado (temperatura > 25°C) aqui:
        
        
        // TODO: Adicione a condição 'else' (para temperaturas entre 15°C e 25°C) aqui:
        
        
        // ------------------------------------------------------------------
    }
}

#Resolução:
#Esta é a solução que cobre as condições solicitadas e inclui um else if e um else para cobrir todos os cenários.
#Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 2: Lógica Condicional ---");
        
        // Simulação de temperatura (os alunos podem mudar este valor para testar)
        double temperaturaAtual = 26.5; 
        
        System.out.println("Temperatura Atual Registrada: " + temperaturaAtual + "°C");
        
        // ------------------------------------------------------------------
        
        // Implementação da lógica de controle de temperatura
        
        if (temperaturaAtual < 15.0) {
            // Se a temperatura for abaixo de 15°C
            System.out.println("RECOMENDAÇÃO: Ligar Aquecedor");
        } else if (temperaturaAtual > 25.0) {
            // Se a temperatura for acima de 25°C
            System.out.println("RECOMENDAÇÃO: Ligar Ar-Condicionado");
        } else {
            // Se a temperatura estiver entre 15°C e 25°C (inclusive)
            System.out.println("RECOMENDAÇÃO: Temperatura ideal. Não é necessário ajustar.");
        }
        
        // ------------------------------------------------------------------
    }
}

#Seção 1 - Exercício 3 - Repetição Simples (for)
#Objetivo:
#Praticar a sintaxe do laço for em Java para simular uma tarefa repetitiva, como a coleta de dados de um sensor.
#Código de Início (Template)
#Implemente o laço for na seção // TODO:.
Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 3: Simulação de Leituras de Sensor ---");
        
        int totalDeLeituras = 10;
        
        System.out.println("Simulando " + totalDeLeituras + " ciclos de leitura...");
        
        // ------------------------------------------------------------------
        
        // TODO: Crie um laço 'for' que comece em 1 e vá até 'totalDeLeituras' (10).
        // A variável de controle (geralmente 'i') deve representar o número da leitura.
        
        
        // Exemplo da estrutura (use esta como guia, mas complete o loop):
        // for (int i = 1; i <= totalDeLeituras; i++) {
        //     // Seu código de impressão aqui
        // }
        
        // Coloque seu laço 'for' aqui:
        
        
        
        
        // ------------------------------------------------------------------
        
        System.out.println("--- Fim da Simulação de Leituras ---");
    }
}

#Resolução
#Esta é a solução que usa o laço for para iterar de 1 a 10 e imprimir o contador.
#Java
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Exercício 3: Simulação de Leituras de Sensor ---");
        
        int totalDeLeituras = 10;
        
        System.out.println("Simulando " + totalDeLeituras + " ciclos de leitura...");
        
        // ------------------------------------------------------------------
        
        // O laço 'for' deve ter 3 partes: 
        // 1. Inicialização (int i = 1)
        // 2. Condição de Parada (i <= totalDeLeituras)
        // 3. Incremento (i++)
        
        for (int i = 1; i <= totalDeLeituras; i++) {
            // A cada ciclo, imprime o número da leitura atual
            System.out.println("Leitura " + i + " - Status: OK");
        }
        
        
        // ------------------------------------------------------------------
        
        System.out.println("--- Fim da Simulação de Leituras ---");
    }
}



