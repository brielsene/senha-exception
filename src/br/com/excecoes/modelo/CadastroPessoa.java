package br.com.excecoes.modelo;

/**
 * Classe cadastra pessoa
 * @author Gabriel
 *
 */
public class CadastroPessoa {
	private String nome;
	private int cpf;
	private double saldo;
	private int senha;
	private int idade;
	
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
	
	/**
	 * Classe saca 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void VerificaIdade() {
		
		
			if(this.idade == 0) {
				throw new IdadeException("A idade não foi digitada");
				
			}else if(this.idade <18) {
				throw new IdadeException("Acesso negado, menor de idade");
				
			}else {
				System.out.println("Idade aceita");
			}
	
		
		
		
		
	}

}
