//Exercicio 1(15 minutos, criar uma classe com o nome conta, atributos:número e saldo.
//métodos: creditar,debitar,getSaldo e getNumero
// Construtor recebendo numero e saldo e criar uma classe programa que use a classe conta.

public class Conta {

	// Atributos >.<
	private String numero;
	private double saldo;

	// Metodos >.<
	public void creditar(double saldo) {
		this.saldo += this.saldo;
	}

	public void debitar(double saldo, double saldoDebitado) {
		this.saldo = this.saldo - saldoDebitado;
	}

	// Construtor >.<

	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;

	}

	// Getters and Setters >.<
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
