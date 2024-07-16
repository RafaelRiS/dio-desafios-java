package Bank;

public class Main {

	public static void main(String[] args) {
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael");
		
		Conta cc = new ContaCorrente(rafael);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(rafael);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
