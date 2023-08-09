package entities;

public class Banco {

	private int numero;
	private String cliente;
	private double saldo;
	
	public Banco(int numero, String cliente, double depositoInicial) {
		
		this.numero = numero;
		this.cliente = cliente;
		deposito(depositoInicial);
	}

	public Banco(int numero, String cliente) {
		
		this.numero = numero;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	

	public String getCliente() {
		return cliente;
	}

	

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Conta " + numero + ", Cliente: " + cliente + " Saldo: $ " + String.format("%.2f", saldo);
	}
}


