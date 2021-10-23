package com.conta.mentorama.classes;

public class ContaEmprersa  extends Conta{

	private String cnpj;
	private String razaoSocial;
	
	public ContaEmprersa(int numero, int agencia, double saldo, String cnpj, String razaoSocial) {
		super(numero, agencia, saldo);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
}
