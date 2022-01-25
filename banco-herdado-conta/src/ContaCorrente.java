
public class ContaCorrente extends Conta {

	/* O construtor não herda da classe mãe, então é necessário criar um construtor
	passando os mesmos parametros da classe Mãe*/
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//O "@Override", sobreescreve um método na classe Mãe
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
