//n�o pode instanciar(criar) objetos dessa classe, pois � uma classe abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// Construtor(Realiza a��es na inicializa��o)
	public Funcionario() {
	}

	/*
	 * M�todo abaixo sem corpo, n�o h� implementa��o nessa classe, mas sim em suas classes filhas.
	 * Colocando abstract no metodo das classe M�e, as classes filhas s�o
	 * obrigadas a terem esse m�todo com implementa��es em suas classes
	 */
	public abstract double getBonificacao();
	
	
	
	// Getters e Seters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
