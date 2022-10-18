import java.util.Scanner;

public class TestaSenha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		CadastroPessoa cp = new CadastroPessoa();
		int senha;
		cp.setSenha(12);
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
