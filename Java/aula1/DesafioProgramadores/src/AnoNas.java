import java.util.Scanner;

public class AnoNas 
{
	public static void main(String[] args) 
	{
		int anoNas;
		Scanner leia = new Scanner(System.in);
		System.out.println("DIGITE O ANO DO SEU NASCIMENTO ");	
		anoNas = leia.nextInt();
		System.out.println("Sua idade é de : "+idade(anoNas));
		if(idade(anoNas)<=18)
		{
			System.out.println("INFANTO JUVENIL");
		}else if(idade(anoNas)<=60)
		{
			System.out.println("ADULTO");
		}else
		{
			System.out.println("SEU IDOSO");
		}
	}
	
	public static int idade(int ano)
	{
		int idade = 2020 - ano;
		return idade;
	}
	
}
