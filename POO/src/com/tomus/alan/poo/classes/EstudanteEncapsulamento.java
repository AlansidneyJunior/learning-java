package com.tomus.alan.poo.classes;

public class EstudanteEncapsulamento {
	private String nome;
	private int idade;
	private float[] notas;
	private float media;
	
	public void imprimeEstudante() {
		System.out.println("--------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		
		float soma = 0;
		
		System.out.println("Notas:");
		for (float nota : this.notas) {
			soma+=nota;
			System.out.print(nota + " ");
		}
		this.media = soma/3;
		
		System.out.println("Média: " + this.media);
		
		if(this.media > 7) {
			System.out.println("SITUAÇÃO: APROVADO");
		}else {
			System.out.println("SITUAÇÃO: REPROVADO");
		}	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public float[] getNotas() {
		return this.notas;
	}
}
