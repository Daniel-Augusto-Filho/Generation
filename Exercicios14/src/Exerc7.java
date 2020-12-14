import java.util.Scanner;

public class Exerc7 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Paciente dodoi = new Paciente();
		System.out.println("DIGITE SEU NOME : ");
		leia.next();
		dodoi.nome = leia.next();
		System.out.println("DIGITE SUA IDADE : ");
		dodoi.idade = leia.nextInt();
		System.out.println("QUAL SEU PROBLEMA ? ");
		leia.next();
		dodoi.doenca = leia.next();
		System.out.println("Seu nome é "+dodoi.nome);
		System.out.println("Sua idade é "+dodoi.idade);
		System.out.println("Seu problema é "+dodoi.doenca);
		
		
	}
}
