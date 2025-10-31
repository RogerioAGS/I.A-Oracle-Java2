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
