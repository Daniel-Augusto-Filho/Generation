
public class CriandoAnimais 
{
	public static void main(String[] args) 
	{
		Cachorro dog = new Cachorro();
		dog.setCor("Marrom");
		dog.setIdade(12);
		dog.setNome("Bob");
		int eleCorre = 1;
		System.out.println("Nome do cachorro: "+dog.getNome()+" Da idade :"+dog.getIdade()+" Da cor "+dog.getCor());
		dog.somAnimal();
		Cavalo potoco = new Cavalo();
		potoco.setCor("Branco");
		potoco.setIdade(45);
		potoco.setNome("Storm");
		int eleCorre1 = 1;
		System.out.println("Nome do Cavalo: "+potoco.getNome()+" Da idade :"+potoco.getIdade()+" Da cor "+potoco.getCor());
		potoco.somAnimal();
		Preguica bixo = new Preguica();
		bixo.setCor("rosa");
		bixo.setIdade(4);
		bixo.setNome("Snorlax");
		int eleCorre2 = 2;
		System.out.println("Nome da Preguiça: "+bixo.getNome()+" Da idade :"+bixo.getIdade()+" Da cor "+bixo.getCor());
		bixo.somAnimal();
		
	}
}
