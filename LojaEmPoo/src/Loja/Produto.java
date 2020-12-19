package Loja;

import java.util.Scanner;

public class Produto 
{
	Scanner leia = new Scanner(System.in);


	private int vBucks800 = 2;
	private int vBucks1200 = 2;
	private int vBucks1500 = 2;
	private int vBucks1800 = 2;
	private int vBucks2000 = 2;
	private int totalVbucks;
	
	
	
	public void comprar800(int op)
	{
				System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
				op = leia.nextInt();
				
						
					if(op == 1)
						{
						
						System.out.println("Voce acaba de comprar um pacote com 800 vBucks no valor de " + (15+(15*0.05)) +" R$");
						System.out.println("Estoque atual de " + (vBucks800-1));
						}
					else if(vBucks800 <1)
						{
						System.out.println("Sem estoque");
						}
					
						
					
				
		
	}
	public void comprar1200(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			if(vBucks800>0) {
				
			
			System.out.println("Voce acaba de comprar um pacote com 1200 vBucks no valor de " + (30+(30*0.05)) +" R$");
		    totalVbucks = (vBucks1200 - 1);
		    System.out.println("Estoque atual de "+totalVbucks);
			}
		else if(op==2)
			{
			
			}
		else
		    {
			System.out.println(" Sinto muito, nosso estoque acabou !!!");
		    }
			}
			
	   }
			
	}
	public void comprar1500(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 1500 vBucksno valor de " + (35+(35*0.05)) +" R$");
		    totalVbucks = (vBucks1500 - 1);
		    System.out.println("Estoque atual de "+totalVbucks);
		    }
		else if(op==2)
			{
			
			}
		else
		    {
			System.out.println(" Sinto muito, nosso estoque acabou !!!");
		    }
			
	   }
			
		
	}
	public void comprar1800(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 1800 vBucks no valor de " + (40 +(40*0.05)) +" R$");
		    totalVbucks = ( vBucks1800- 1);
		    System.out.println("Estoque atual de "+totalVbucks);
			
			
			}
		else if(op==2)
			{
				System.out.println("Agradecemos Pela visita");
			}
	
		    }
			
	   }
			
		
	
	public void comprar2000(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 2000 vBucks no valor de" + (15+(15*0.05)) +" R$");
		    totalVbucks = (vBucks2000 - 1);
		    System.out.println("Estoque atual de "+totalVbucks);
			
			
			}
		else if(op==2)
			{
			
			}
		else
		    {
			System.out.println(" Sinto muito, nosso estoque acabou !!!");
		    }
			
	   }
			
		
	}

}
