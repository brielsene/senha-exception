package br.com.excecoes.teste;

import br.com.excecoes.modelo.CadastroPessoa;
import br.com.excecoes.modelo.SaldoInsuficienteException;

public class TestaCadastro {

	public static void main(String[] args) {
		CadastroPessoa cp = new CadastroPessoa();
		cp.deposita(220.0);
		try {
			cp.saca(210);
		} catch (SaldoInsuficienteException ex) {
			ex.getMessage();
			ex.printStackTrace();
			// }

		}

	}
}
