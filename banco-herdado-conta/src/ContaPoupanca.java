
public class ContaPoupanca extends Conta {
	
	/* O construtor não herda da classe mãe, então é necessário criar um construtor
	passando os mesmos parametros da classe Mãe*/
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
