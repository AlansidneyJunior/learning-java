package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante e1 = new Estudante();
		e1.nome = "Joao";
		e1.matricula = "123456";
		e1.idade = 12;
		
		System.out.println(e1.nome);
		System.out.println(e1.matricula);
		System.out.println(e1.idade);
	}

}
