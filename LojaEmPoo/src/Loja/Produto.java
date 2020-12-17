package Loja;

import java.util.Scanner;

public class Produto 
{
	Scanner leia = new Scanner(System.in);
	private int estoqueVbucks = 10;
	private int vBucks800 = 2;
	private int vBucks1000 = 2;
	private int vBucks1200 = 2;
	private int vBucks1800 = 2;
	private int vBucks2000 = 2;
	private int totalVbucks;
	
	
	//Métodos 
	public void comprar800(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			if(vBucks800>0)
			{
			System.out.println("Voce acaba de comprar um pacote com 800 vBucks");
		    totalVbucks = ( vBucks800 - 1);
		    System.out.println("Estoque atual de "+ totalVbucks);
			
			
			}
		else if(op==2)
			{
			
			}
		else
		    {
			System.out.println(" Sinto muito, nosso estoque acabou !!!");
		    }
			menuOp();
			}
	   }
			
		
	}
	public void comprar1000(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			if(vBucks800>0) {
				
			
			System.out.println("Voce acaba de comprar um pacote com 1000 vBucks");
		    totalVbucks = (vBucks1000 - 1);
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
			menuOp();
	   }
			
	}
	public void comprar1200(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 1200 vBucks");
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
			menuOp();
	   }
			
		
	}
	public void comprar1800(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 1800 vBucks");
		    totalVbucks = ( vBucks1800- 1);
		    System.out.println("Estoque atual de "+totalVbucks);
			
			
			}
		else if(op==2)
			{
			
			}
		else
		    {
			System.out.println(" Sinto muito, nosso estoque acabou !!!");
		    }
			menuOp();
	   }
			
		
	}
	public void comprar2000(int op)
	{
		System.out.println("Deseja prosseguir com a compra [1]-SIM [2]- NÃO : ");
		op = leia.nextInt();
		
			{
		if(op == 1)
			{
			System.out.println("Voce acaba de comprar um pacote com 2000 vBucks");
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
			menuOp();
	   }
			
		
	}
	
	public void menuOp()
	{
		System.out.println("CODIGO|  PRODUTO    |    VALOR   |");  
		System.out.println("[g1] -| 800  Vbucks |    30 R$   |");
		System.out.println("[g2] -| 1000 Vbucks |    40 R$   |");
		System.out.println("[g3] -| 1200 Vbucks |    80 R$   |");
		System.out.println("[g4] -| 1800 Vbucks |   120 R$   |");
		System.out.println("[g5] -| 2000 Vbucks |   130 R$   |");
		System.out.println("[6]  -| Sair        |   200 R$   |");
	}
}
