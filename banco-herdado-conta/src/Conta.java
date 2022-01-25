

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Quando colocamos static o atributo se torna da classe
	private static int total;
	

	
	//O construtor s�o elaborados visando que os objetos tenham seus atributos inicializados 
	//na pr�pria constru��o, sendo obrigat�rio na cria��o do objeto(new) passarmos os atributos que
	//desejamos
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas criadas � " + Conta.total);
		this.agencia = 2546;
		this.numero = 9448;
//		System.out.println("Estou criando uma conta, pelo metodo de 'inicializa��o' " + this.agencia);
	}
    
    //Com o void n�o precisamos retornar nada no metodo
    //M�todo depositar
    public void deposita(double valor) {
    	saldo += valor;
    }
    
    //M�todo sacar
    public boolean saca(double valor){
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    //M�todo transferir
    public boolean transfere(double valor, Conta destino) {
    	if(this.saca(valor)) {
    		destino.deposita(valor);
    		return true;
    	} 
    		return false;
    }
    
    
    
    
    
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}


    
    
    
    
    
}
