
public class Autenticacaoutil { //concentra aqui o codigo pra autenticação, é uma composição : Cliente, Administrador e Gerente usam. Na composição um depende do outro

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
