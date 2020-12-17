package Loja;

public abstract class Pessoa 
{
	private String nome;
	private char sexo;
	private int nascimento;
	
	//Métodos
	
	public void boasVindas(char sexo,String nome,int idade)
	{
	
		
		if(sexo == 'M' || sexo == 'm')
		{
			System.out.println("Seja bem-vindo ao D'Store senhor "+ nome +" de "+(2020 -idade)+" anos ");
		}
		else if(sexo == 'F' || sexo == 'f')
		{
			System.out.println("Seja bem-vinda ao D'Store senhora "+ nome +" de "+(2020 -idade)+" anos ");
		}
		else if(sexo == 'O' || sexo == 'o')
		{
			System.out.println("Seja bem-vind* ao D'Store senhor* "+ nome +" de "+(2020 -idade)+" anos ");
		}
			
	}
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nome, char sexo, int nascimento)
	{
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.nome = nome;
	}
		
	//getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	
	
}
