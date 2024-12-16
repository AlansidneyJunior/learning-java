package com.tomus.alan.poo.heranca.test;

import com.tomus.alan.poo.heranca.classes.Funcionario;
import com.tomus.alan.poo.heranca.classes.Endereco;
import com.tomus.alan.poo.heranca.classes.Pessoa;

public class herancaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Emily Marques", "123456789-10");
		p.print();
		Endereco e = new Endereco("Rua J Carneiro", "Vila Rica");
		p.setEndereco(e);
		
		Funcionario f = new Funcionario(p.getNome(),p.getCpf(), 2000.00);
		f.print();
	}

}
