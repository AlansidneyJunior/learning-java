package com.tomus.alan.poo.test;

import com.tomus.alan.poo.classes.CalculadoraRetornoVarargs;

public class CalculadoraRetornoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraRetornoVarargs calc = new CalculadoraRetornoVarargs();
		
		System.out.println(calc.soma(1, 10));
		System.out.println(calc.sub(1, 10));
		System.out.println(calc.mult(1, 10));
		System.out.println(calc.div(10, 10));
		System.out.println(calc.somaArray(1,2,3,4,5,6));
	}

}
