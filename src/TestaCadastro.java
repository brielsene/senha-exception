
public class TestaCadastro {

	public static void main(String[] args) {
		CadastroPessoa cp = new CadastroPessoa();
		cp.deposita(200.0);
		try {
			cp.saca(210);
		} catch (SaldoInsuficienteException ex) {
			ex.getMessage();
			ex.printStackTrace();
			// }

		}

	}
}
