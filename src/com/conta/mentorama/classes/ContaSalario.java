package com.conta.mentorama.classes;

public class ContaSalario  extends Conta{
	
	private String cpf;
	private String titular;
	
	public ContaSalario(int numero, int agencia, double saldo,String cpf, String titular) {
		super(numero, agencia, saldo);
		this.cpf = cpf;
		this.titular = titular;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	

}
