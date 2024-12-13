package com.tomus.alan.poo.classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	{
		System.out.println("Inicializando objeto...");
	}
	
	
	public Funcionario(String nome, String cpf, double salario) {
		System.out.println("Dentro do construtor...");
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salario: " + this.salario);
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
