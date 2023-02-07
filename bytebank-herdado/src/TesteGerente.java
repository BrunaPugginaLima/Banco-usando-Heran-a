
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		 
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("r32334242");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(5699);
		boolean autenticou = g1.autentica(5699);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
