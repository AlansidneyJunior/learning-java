package com.tomus.alan.poo.associacoes.teste;

import com.tomus.alan.poo.associacoes.classes.Aluno;
import com.tomus.alan.poo.associacoes.classes.Local;
import com.tomus.alan.poo.associacoes.classes.Professor;
import com.tomus.alan.poo.associacoes.classes.Seminario;

public class AssociacaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Alan Junior", 24);
		Aluno aluno2 = new Aluno("Andre Rosa", 25);
		Seminario sem = new Seminario("Dominando o Spring boot!");
		Professor prof = new Professor("Marcone", "MMC");
		Local local = new Local("Rua Copacana", "Boa Viagem");
		
		aluno1.setSeminario(sem);
		aluno2.setSeminario(sem);
		
		sem.setProfessor(prof);
		sem.setLocal(local);
		sem.setAlunos(new Aluno[] {aluno1,aluno2});
		
		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		prof.setSeminarios(semArray);
		
		sem.print();
		aluno1.print();
		prof.print();
		
		
		
	}

}
