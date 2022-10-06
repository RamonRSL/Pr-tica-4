package br.com.newtonpaiva.pratica4p1;

public abstract class Conta {
	private double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void imprimeExtrato();
	
}
