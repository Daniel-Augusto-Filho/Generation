import java.util.Scanner;

public class Exerc5 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Patinete patin = new Patinete();
		System.out.println("DIGITE A COR DO PATINETE : ");
		patin.cor = leia.next();
		System.out.println("DIGITE A QUANTIDADE DE RODAS DO PATINETE : ");
		patin.rodas = leia.nextInt();
		System.out.println("DIGITE O MODELO DO PATINETE : ");
		patin.marca = leia.next();
		System.out.println(" O seu patinete é : ");
		System.out.println(patin.cor);
		System.out.println(patin.rodas+" RODAS ");
		System.out.println("Marca "+ patin.marca);
	}
}
