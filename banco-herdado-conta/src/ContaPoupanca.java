
public class ContaPoupanca extends Conta {
	
	/* O construtor n�o herda da classe m�e, ent�o � necess�rio criar um construtor
	passando os mesmos parametros da classe M�e*/
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
