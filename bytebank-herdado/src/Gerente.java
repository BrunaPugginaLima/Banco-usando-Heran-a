
public class Gerente extends Funcionario implements Autenticavel{ //extend : é uma extenção / gerente herda da classe funcionário , assina o contrato Autenticavel
	
	private Autenticacaoutil autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacaoutil();
	}
	
	public double getBonificacao() {//reescrita, redefinição do metodo na classe filha, mesma assinatura
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return super.getSalario(); //super diz que é da super classe, chama o getBonificação da superclasse mais a regra desta
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
