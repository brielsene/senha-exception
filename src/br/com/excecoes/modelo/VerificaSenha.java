package br.com.excecoes.modelo;


public class VerificaSenha extends CadastroPessoa {
	
	public void VerificaSenha(int senha) {
		if(super.getSenha() != senha) {
			throw new SenhaInvalidaException("Senha inválida!");
		}
		System.out.println("Login efetuado com sucesso");
	}
	

}
