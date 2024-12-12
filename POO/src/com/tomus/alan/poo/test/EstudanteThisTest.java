package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.EstudanteThis;

public class EstudanteThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstudanteThis e1 = new EstudanteThis();
		EstudanteThis e2 = new EstudanteThis();
		e1.nome = "Joao";
		e1.matricula = "123456";
		e1.idade = 12;
		
		e2.nome = "Maria";
		e2.matricula = "654321";
		e2.idade = 21;
		
		e1.imprime();
		e2.imprime();
	}

}
