package br.com.commerce;

public class Caixa {
	private double saldo;
	
	public void adicionarSaldo(double valor) {
		saldo += valor;
	}
	public void debitarSaldo(double valor) {
		saldo -= valor;
	}
	public double consultarSaldo() {
		return saldo;
	}
}
