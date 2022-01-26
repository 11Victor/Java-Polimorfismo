//O Gerente � um Funcionario, ou seja ele herda da classe Funcionario, assina o contrato Autenticavel, � um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	//super significa que esta pegando da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
