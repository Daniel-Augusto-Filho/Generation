
public class Cavalo extends Animal
{

	public Cavalo()
	{
		
	}
	public Cavalo(String nome, int idade, String cor)
	{
		super(nome, idade, cor);
		
	}
	@Override
	public void somAnimal()
	{
		System.out.println(" RBRBRBRBRB RELINCHANDO RELINCHANDO BRBRBRBRBRBBR");
		
	}
	@Override
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
