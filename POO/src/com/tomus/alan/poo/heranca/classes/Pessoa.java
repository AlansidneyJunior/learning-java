package com.tomus.alan.poo.heranca.classes;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void print() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
