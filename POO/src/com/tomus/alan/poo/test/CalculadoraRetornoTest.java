package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.CalculadoraRetorno;

public class CalculadoraRetornoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraRetorno calc = new CalculadoraRetorno();
		
		System.out.println(calc.soma(1, 10));
		System.out.println(calc.sub(1, 10));
		System.out.println(calc.mult(1, 10));
		System.out.println(calc.div(10, 10));
	}

}
