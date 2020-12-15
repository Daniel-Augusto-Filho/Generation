import java.util.Scanner;

public class BancoMain
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		banco teste = new banco();
		System.out.println(" Digite seu cpf : ");
		teste.cpf = leia.next();
		System.out.println(" Digite o numero da conta : ");
		teste.numeroConta = leia.nextInt();
		System.out.println("Seu saldo é de : " + teste.saldoConta);
		
		
		
		
		
		
	
		
	
	}
}
