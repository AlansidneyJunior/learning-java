package com.tomus.alan.poo.associacoes.classes;

public class Professor {
	private String nome;
	private String especialidade;
	
	private Seminario[] seminarios;

	
	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void print(){
		System.out.println("\n----Relatório Professor----");
		System.out.println("Nome: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		
		if(seminarios != null && seminarios.length != 0) {
			for(Seminario sem : seminarios) {
				System.out.print(sem.getTitulo() + " ");
			}
		}else {
			System.out.println("Nao ha seminarios inscritos com este professor.");
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
}
