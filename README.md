# I.A. with Machine Learning in Java


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

#Seção 1 - Desafio 1 - Conversor de Temperatura
#Objetivo:
#Integrar a entrada de dados do usuário (Scanner), a conversão de tipos (garantindo que o input seja um double) e o uso de uma fórmula matemática para conversão.
#Pré-requisito (Importação):
#É importante lembrar os alunos que a classe Scanner requer uma linha de importação no início do arquivo.
#Código de Início (Template)
#Completar a importação, a criação do objeto Scanner, a leitura da temperatura e o cálculo na seção // TODO:.
#Java
// TODO: Adicione a importação necessária para a classe Scanner aqui
import java.util.Scanner; 

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

#Desafio 2 - Configuração de Build
#Objetivo:
Aprender a adicionar dependências externas (bibliotecas) ao projeto usando o gerenciador de build (Maven ou Gradle) e implementar o logging básico com uma biblioteca padrão (Log4j ou similar como o SLF4J com Logback, que é mais moderno e leve, e é o que usaremos aqui).

1. Instruções Comuns (Java)
Os alunos devem criar uma classe chamada LoggerExample (ou usar a Main) e adicionar o código de logging após configurarem o build.
LoggerExample.java (Para ser usada após a configuração do build)
Java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {

    // 1. Criação do logger estático para esta classe
    // Usamos SLF4J como interface, que é o padrão da indústria.
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        
        System.out.println("--- Desafio 2: Teste de Logging (Verifique a saída no console) ---");
        
        // 2. Uso dos diferentes níveis de logging
        LOGGER.info("Iniciando o sistema de ML...");
        
        // Simulação de um evento importante no sistema
        int registrosProcessados = 10000;
        LOGGER.debug("Processando {} registros do Data Lake.", registrosProcessados);

        // Mensagem de alerta (por exemplo, um modelo não está carregando)
        LOGGER.warn("Atenção: A configuração de credenciais está incompleta.");

        // Mensagem de erro (se o projeto falhar ao rodar)
        try {
            // Simulação de uma falha
            throw new RuntimeException("Falha ao inicializar o Módulo ID3.");
        } catch (Exception e) {
            LOGGER.error("ERRO CRÍTICO: Não foi possível carregar o módulo. Detalhes: {}", e.getMessage());
        }

        System.out.println("--- Fim do Teste ---");
    }
}


2. Instruções Específicas para o Gerenciador de Build
A. Para Usuários de Maven (pom.xml)
Os alunos devem adicionar as seguintes dependências ao arquivo pom.xml, dentro da tag <dependencies>.
Maven Configuration (Código):

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.oracle.ia</groupId>
    <artifactId>ia-java-course</artifactId>
    <version>1.0-SNAPSHOT</version>


    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>


    <!-- TODO: Adicionar as dependências de SLF4J/Logback aqui dentro da tag <dependencies> -->
    <dependencies>
        <!-- SLF4J API (O frontend que usamos no código Java) -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.12</version>
        </dependency>
       
        <!-- Logback Classic (A implementação real do logging) -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.4.14</version>
            <scope>runtime</scope>
        </dependency>
    </dependencies>


</project>


Passos:
Copiar e colar as duas dependências (slf4j-api e logback-classic).
Salvar o pom.xml.
Executar o comando de recarga do Maven na IDE (geralmente um ícone de "M" ou "Recarregar").
Executar a classe LoggerExample.java.
B. Para Usuários de Gradle (build.gradle)
Os alunos devem adicionar as seguintes dependências ao arquivo build.gradle, dentro do bloco dependencies.
Gradle Configuration (Código):

plugins {
    id 'java'
}

group = 'com.oracle.ia'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

// TODO: Adicionar as dependências de SLF4J/Logback aqui dentro do bloco dependencies
dependencies {
    // SLF4J API (O frontend que usamos no código Java)
    implementation 'org.slf4j:slf4j-api:2.0.12'
    
    // Logback Classic (A implementação real do logging)
    runtimeOnly 'ch.qos.logback:logback-classic:1.4.14'
}

test {
    useJUnitPlatform()
}


Passos:
Copiar e colar as duas linhas de dependência no bloco dependencies.
Salvar o build.gradle.
Executar o comando de sincronização do Gradle na IDE (geralmente um ícone de "elefante" ou "Sincronizar").
Executar a classe LoggerExample.java.

