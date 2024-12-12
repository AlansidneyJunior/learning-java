package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.EstudanteEx;

public class EstudanteExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstudanteEx e1 = new EstudanteEx();
		EstudanteEx e2 = new EstudanteEx();
		e1.nome = "Joao";
		e1.idade = 12;
		float[] notas1 = {10,9,8};
		e1.notas = notas1;
		
		e2.nome = "Maria";
		e2.idade = 21;
		float[] notas2 = {9,7,4};
		e2.notas = notas2;
	
		e1.imprimeEstudante();
		e2.imprimeEstudante();
	}

}
