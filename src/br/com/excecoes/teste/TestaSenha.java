package br.com.excecoes.teste;


import java.util.Scanner;

import br.com.excecoes.modelo.CadastroPessoa;
import br.com.excecoes.modelo.SenhaInvalidaException;
import br.com.excecoes.modelo.VerificaSenha;

public class TestaSenha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		CadastroPessoa cp = new CadastroPessoa();
		int senha;
		cp.setSenha(123);
		senha = cp.getSenha();
		VerificaSenha vf = new VerificaSenha();
		try {
			vf.VerificaSenha(senha);
		}catch(SenhaInvalidaException ex){
			String msg = ex.getMessage();
			System.out.println("Exception "+msg);
			ex.printStackTrace();
			
		}
		

	}

}
