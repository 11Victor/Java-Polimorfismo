
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente Victor = new Gerente();
		
		Victor.setNome("Victor Valencio");
		Victor.setCpf("548.564.564-54");
		Victor.setSalario(6000.00);
		
		System.out.println(Victor.getNome());
		System.out.println(Victor.getBonificacao());
	}
	
}
