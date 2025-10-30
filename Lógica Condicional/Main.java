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

