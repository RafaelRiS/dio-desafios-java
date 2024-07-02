import java.util.Scanner;

// Inicia-se o programa com esta classe main

public class Main {
    /**
     * Método principal utilizado para receber parâmetros do usuario e iniciar a contagem.
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // entrada onde sao adquiridos os dados

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Solicita o primeiro parâmetro ao usuario

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Solicita o segundo parâmetro ao usuario

        try {
            Contador.contar(parametroUm, parametroDois); // Espera a contagem
        } catch (ParametrosInvalidosException e) { // Captura a excecao se ela for lancada
            System.out.println(e.getMessage()); // Imprime a mensagem da exceção
        } finally {
            terminal.close(); // Termina o programa de scanner
        }
    }
}