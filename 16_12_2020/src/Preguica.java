
public class Preguica extends Animal
{
	public Preguica ()
	{
		
	}

	public Preguica(String nome, int idade, String cor) 
	{
		super(nome, idade, cor);
	}
	
	@Override
	public void somAnimal()
	{
		System.out.println(" zzz. zzz. zzz. ");
		System.out.println(" 		zzz. zzz. zzz. ");
		System.out.println(" 				zzz. zzz. zzz. ");
		
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
