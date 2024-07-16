package Bank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	LocalTime horaAtualizada = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	String hora = horaAtualizada.format(formatter);
	
	protected void imprimirInfosComuns() {
		System.out.println("Hora: " + hora);
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
