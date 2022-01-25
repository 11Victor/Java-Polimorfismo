
public class TesteReferencia {

	public static void main(String[] args) {

		// Criando um novo objeto Gerente g1
		//Gerente g1 = new Gerente();
		

		// O código abaixo compila, pois todo Gerente é um funcionário
		Funcionario g1 = new Gerente();
		g1.setNome("Victor Valencio");
		g1.setSalario(5000.0);
		String nome = g1.getNome();

		// O código abaico não compila, pois nem todo Funcionário é um Gerente
		// Gerente g1 = new Funcionario();

		Funcionario f = new Funcionario();
		f.setSalario(2000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());

	}

}
