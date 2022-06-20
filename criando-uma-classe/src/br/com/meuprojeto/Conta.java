package br.com.meuprojeto;

public class Conta {

	String cliente;
	double saldo;

	void exibasaldo() {
		System.out.println(cliente + " seu saldo � " + saldo);
	}

	void saque(double valor) {
		saldo -= valor;
	}

	void deposito(double valor) {
		saldo += valor;
	}
	void transferenciaValor(Conta destino, double valor) {
		this.saque(valor);
		destino.deposito(valor);
	}
}
