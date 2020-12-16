
public class Animal 
{
	private String nome;
	private int idade;
	private String cor;
	
	public Animal()
	{
		
	}
	
	public Animal( String nome,int idade,String cor)
	{
	
	}
	 
	//getters e setters
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public String getCor() 
	{
		return cor;
	}
	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	//Métodos

	public void somAnimal()
	{
		
		
	}
	public void correr(int eleCorre)
	{
		if (eleCorre == 1 )
		{
			System.out.println(" EU CORRO MT RAPIDO");
		}
		else if (eleCorre == 2)
		{
			System.out.println("CORRO NÃO, SOU PREGUIÇOSO ");
		}
		
	}
	
	
}
