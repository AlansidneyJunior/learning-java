package com.tomus.alan.poo.classes;

public class CalculadoraRetornoVarargs {
	
	public float soma(float a, float b) {
		return (a + b); 
	}
	
	public float sub(float a, float b) {
		return (a - b); 
	}
	
	public float mult(float a, float b) {
		return (a * b); 
	}
	
	public float div(float a, float b) {
		return (a / b); 
	}
	
	public float somaArray(float... arr) {
		float soma = 0f;
		
		for(float e : arr) {
			soma += e;
		}
		return soma;
	}
}
