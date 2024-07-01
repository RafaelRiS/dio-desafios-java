import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens de solicitação de dados para o usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        //Solicita o nome do cliente
        System.out.println("Por favor, digite seu nome completo:");
        String nomeCliente = scanner.nextLine();

        //Solicita a agencia do cliente
        System.out.println("Por favor, digite o numero da agência:");
        String agencia = scanner.nextLine();

        //Solicita o numero da conta ao cliente
        System.out.println("Por favor, digite o numero da conta sem o caracter(-):");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        //Solicita o saldo inicial
        System.out.println("Por favor, digite o saldo inicial sem virgula(,) e ponto(.):");
        double saldo = scanner.nextDouble();

        //Mensagem ao cliente
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d, e seu saldo e R$ %.2f que ja esta disponivel para saque.%n",nomeCliente, agencia, numeroConta, saldo);
        
    }
}
