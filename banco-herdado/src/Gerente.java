//O Gerente � um funcion�rio, ou seja ele herda da classe funcion�rio
public class Gerente extends Funcionario{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	//super significa que esta pegando da classe m�e
	public double getBonificacao() {
		System.out.println("Chamando m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}
	
	
	
	
	
}
