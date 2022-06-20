package br.com.meuprojeto;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibasaldo();
		
		//conta.saque(2000.0);
		//conta.exibasaldo();
		
		//conta.deposito(8000);
		//conta.exibasaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5_000.00;
		destino.exibasaldo();
	}
}
