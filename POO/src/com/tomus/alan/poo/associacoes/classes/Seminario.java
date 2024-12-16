package com.tomus.alan.poo.associacoes.classes;

public class Seminario {
	private String titulo;
	
	private Aluno[] alunos;
	private Professor professor;
	private Local local;
	
	public Seminario(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public void print(){
		System.out.println("\n----Relatório Seminario----");
		System.out.println("Titulo: " + this.titulo);
		System.out.println ("Professor: " + this.professor.getNome());
		
		if(this.local != null)
			System.out.println("Local: " + this.local.getRua() + ", " + this.local.getBairro());
		else {
			System.out.println("Nenhum local cadastrado para esse seminario.");
		}
		if (this.alunos != null && this.alunos.length != 0) {
			for(Aluno aluno : alunos) {
				System.out.print(aluno.getNome() + "/ ");
			}
			System.out.println();
		}else {
			System.out.println("Nenhum alunos inscritos para esse seminario.");
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	
}
