package br.com.excecoes.teste;

import br.com.excecoes.modelo.CadastroUsuario;
import br.com.excecoes.modelo.*;

public class TestaCadastroUsuario {
	
	public static void main(String[] args) {
		CadastroUsuario cu = new CadastroUsuario();
		cu.setSenha(123);
		int senha = 123;
		try {
			cu.validaSenha(senha);
		}catch(SenhaInvalidaException ex) {
			System.out.println("Senha inválida");
		}finally {
			cu.close();
		}
		
		

	}
	
	
	
}
