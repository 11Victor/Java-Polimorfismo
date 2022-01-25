//não pode instanciar(criar) objetos dessa classe, pois é uma classe abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// Construtor(Realiza ações na inicialização)
	public Funcionario() {
	}

	/*
	 * Método abaixo sem corpo, não há implementação nessa classe, mas sim em suas classes filhas.
	 * Colocando abstract no metodo das classe Mãe, as classes filhas são
	 * obrigadas a terem esse método com implementações em suas classes
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
