package banco;

import java.util.Scanner;

public class Banco 
{
	public static void main(String[] args) 
	{
		Conta saldo = new Conta();
		Menu menu = new Menu();
		String nome;
		String cpf;
		int sair = 0;
		int superSaida = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		menu.MenuCpf();
		cpf = input.next();
		menu.MenuNome();
		nome = input.next();
		
		
		do
		{
						do
						{
							menu.MenuBanco(nome,saldo.getSaldo());
							sair = input.nextInt();
							
							switch(sair)
							{
								case 1 : menu.Menusaldo(saldo.getSaldo());
										 double valorSaque = input.nextDouble();
										 saldo.TiraSaldo(valorSaque);
										 menu.Voltar();
										 int saidaSaldo = input.nextInt();
										 
										 if(saidaSaldo == 1 )
										 {
											 superSaida = saidaSaldo;
											
										 }
										 	
										 else if(saidaSaldo == 2)
										 	{
										 		sair = input.nextInt();
										 	}
										 break;
										
								case 2 : menu.MenuDeposito(saldo.getSaldo(),saldo.limite);
										 double colocaSaldo = input.nextDouble();
										 menu.Voltar();
										 int saidaSaldo1 = input.nextInt();
										 
										 if(saidaSaldo1 == 1 )
										 {
											 superSaida = saidaSaldo1;
											
										 }
										 	
										 else if(saidaSaldo1 == 2)
										 	{
										 		sair = input.nextInt();
										 	}
										 
										 
										 
										 break;
										 
										 
									
								case 3 : 
									 menu.Voltar();
									 int saidaSaldo2 = input.nextInt();
									 
									 if(saidaSaldo2 == 1 )
									 {
										 superSaida = saidaSaldo2;
										
									 }
									 	
									 else if(saidaSaldo2 == 2)
									 	{
									 		sair = input.nextInt();
									 	}
									 
									
								
								 break;
								
							}
					
				}
				while(sair == 5);
		}			
		while(superSaida == 1);	
		 
		System.out.println("Volte Sempre  !!!");
						
		
		
		
		
	}
}
