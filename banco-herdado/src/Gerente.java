//O Gerente é um Funcionario, ou seja ele herda da classe Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	//super significa que esta pegando da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Gerente");
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
