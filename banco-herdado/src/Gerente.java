//O Gerente é um funcionário, ou seja ele herda da classe funcionário
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
	
	//super significa que esta pegando da classe mãe
	public double getBonificacao() {
		System.out.println("Chamando método de bonificação do Gerente");
		return super.getSalario();
	}
	
	
	
	
	
}
