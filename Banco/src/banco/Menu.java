package banco;
import java.util.Scanner;

public class Menu extends Conta
{
	Scanner scan1 = new Scanner(System.in);
	
	public void MenuCpf()
	{
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                     G5 - BANK                       |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                   DIGTE SEU CPF                     |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                     G5 - BANK                       |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
	}
	public void MenuNome()
	{
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                     G5 - BANK                       |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                   DIGTE SEU NOME                    |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                     G5 - BANK                       |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
	}
	
	public void MenuBanco(String nome,double saldo)
	{
		
		System.out.println  ("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|        Ol� "+nome+"       SALDO : R$"+saldo+"       |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|  1 - Saque                                          |");
		System.out.println("|                                                     |");
		System.out.println("|  2 - Deposito                                       |");
		System.out.println("|                                                     |");
		System.out.println("|  3 - Sair                                           |");
		System.out.println("|                                                     |");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("| Movimentos Disponiveis : "+this.movimentos+"        |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
	}
	public void Menusaldo(double saldo)
	{
		System.out.println  ("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|               SALDO : R$"+saldo+"                   |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                    SAQUE                            |");
		System.out.println("|                                                     |");
		System.out.println("|             Quanto deseja sacar ?                   |");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		
	}
	public void MenuDeposito(double saldo, double limi)
	{

		System.out.println  ("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("| SALDO : R$"+saldo+"  Limite  R$ : "+limi+ "         |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                    DEPﾓSITO                         |");
		System.out.println("|                                                     |");
		System.out.println("|             Quanto deseja depositar  ?              |");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
		System.out.println("|                                                     |");
		System.out.println("|覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧慾");
	}
	public void Voltar()
	{
		System.out.println("[1] - Voltar [2] - Sair ");
	}
	
	
}
