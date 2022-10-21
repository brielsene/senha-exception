package br.com.excecoes.teste;

import br.com.excecoes.modelo.CadastroPessoa;
import br.com.excecoes.modelo.IdadeException;
import br.com.excecoes.modelo.SaldoInsuficienteException;

public class TestaCadastro {

	public static void main(String[] args) {
		CadastroPessoa cp = new CadastroPessoa();
		
		cp.setIdade(0);
		
		try {
			cp.VerificaIdade();
		}catch(IdadeException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
			

		

	}
}
