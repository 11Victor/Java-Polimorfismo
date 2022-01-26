
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Stephany Souza");
		g1.setCpf("548.564.564-54");
		g1.setSalario(6000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2525);
		boolean autenticou = g1.autentica(2525);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}
