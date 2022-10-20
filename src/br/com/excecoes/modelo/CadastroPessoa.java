package br.com.excecoes.modelo;


public class CadastroPessoa {
	private String nome;
	private int cpf;
	private double saldo;
	private int senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor)throws SaldoInsuficienteException {
		if(valor>this.saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente "+ getSaldo()+ " Valor: "+valor);
		}
		
		this.saldo +=valor;
		
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
