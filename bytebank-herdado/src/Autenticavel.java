//contrato autenticavel, quem assina precisa implementar setSenha e autentica

public abstract interface Autenticavel { //interface nao pode ter nada concreto, nem classe nem metodos
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
