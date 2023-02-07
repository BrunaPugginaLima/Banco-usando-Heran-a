
public class TesteFuncionario {

	public static void main(String[] args) {
		//Funcionario nico = new Gerente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("nico stepoof");
		nico.setCpf("23343646456");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		

	}

}
