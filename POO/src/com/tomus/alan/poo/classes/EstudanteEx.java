package com.tomus.alan.poo.classes;

public class EstudanteEx {
	public String nome;
	public int idade;
	public float[] notas;
	public float media;
	
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
}
