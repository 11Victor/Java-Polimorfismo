
public class ContaCorrente extends Conta {

	/* O construtor n�o herda da classe m�e, ent�o � necess�rio criar um construtor
	passando os mesmos parametros da classe M�e*/
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//O "@Override", sobreescreve um m�todo na classe M�e
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
