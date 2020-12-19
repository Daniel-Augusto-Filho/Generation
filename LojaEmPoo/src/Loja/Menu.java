package Loja;

public class Menu 
{
	public void menuEscolha()
	{
		System.out.println("CODIGO|  PRODUTO    |");  
		System.out.println(" [1] -  | COMPRAR             |");
		System.out.println(" [2] -  | GERENCIAR ESTOQUE   |");
		System.out.println(" [3] -  | CARRINHO DE COMPRAS |");
		System.out.println(" [6] -  | SAIR                |"); 
	}
	public void menuOp()
	{
		System.out.println("CODIGO |  PRODUTO    |    VALOR   |");  
		System.out.println("[1] -  | 800  Vbucks |    15 R$   |");
		System.out.println("[2] -  | 1200 Vbucks |    30 R$   |");
		System.out.println("[3] -  | 1500 Vbucks |    35 R$   |");
		System.out.println("[4] -  | 1800 Vbucks |    40 R$   |");
		System.out.println("[5] -  | 2000 Vbucks |    85 R$   |");
		System.out.println("[6] -  |     Sair    |            |");
	}
	
	public void menuGerenciarEstoque()
	{
		System.out.println(" Digite o nome do produto que você quer remover ");
	}
	
}
