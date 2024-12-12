package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.EstudanteEncapsulamento;

public class EstudanteEncapsulamentoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstudanteEncapsulamento e1 = new EstudanteEncapsulamento();
		EstudanteEncapsulamento e2 = new EstudanteEncapsulamento();
		
		e1.setNome("Joao");
		e1.setIdade(21);
		float[] notas1 = {10,9,8};
		e1.setNotas(notas1);
		
		e2.setNome("Maria");
		e2.setIdade(23);
		float[] notas2 = {7,3,6};
		e2.setNotas(notas2);
		
		e1.imprimeEstudante();
		e2.imprimeEstudante();
	}

}
