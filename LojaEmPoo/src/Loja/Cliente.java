package Loja;

public class Cliente extends Pessoa
{
	private String cpf;
	 
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cliente()
	{
		
	}
	public Cliente(String nome, char sexo, int nascimento) 
	{
		super(nome, sexo, nascimento);
	}
	 
}
