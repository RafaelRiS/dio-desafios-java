 //Programa utilizado para contagem e validação

public class Contador {
    
    /**
     * O parametroUm é o primeiro número para contagem.
     * O parametroDois é o segundo número para contagem.
     * E o ParametrosInvalidosException é exibido se o segundo parâmetro for menor que o primeiro.
     */

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) { // Faz a contagem
            System.out.println("Imprimindo o número " + i);
        }
    }
}