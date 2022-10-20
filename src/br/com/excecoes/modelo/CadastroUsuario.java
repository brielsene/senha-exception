package br.com.excecoes.modelo;

public class CadastroUsuario implements AutoCloseable {
	private String usuario;
	private int senha;
	
	public CadastroUsuario() {
		//throw new SenhaInvalidaException("Teste");
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void validaSenha(int senha) {
		if(this.senha!=senha) {
			throw new SenhaInvalidaException("Senha inválida");
		}
		System.out.println("Login efetuado com sucesso");
	}

	@Override
	public void close() throws RuntimeException {
		System.out.println("Fechado");
		
	}
	

}
