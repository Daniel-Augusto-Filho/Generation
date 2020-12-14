import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args)
	
	{
		Scanner leia = new Scanner(System.in);
		Produto prod = new Produto();
		prod.tipoProduto = "CAMISETA";
		prod.valorProduto = 30.00;	
		Produto prod1 = new Produto();
		prod1.tipoProduto = "Calça";
		prod1.valorProduto = 50.00;
		Produto prod2 = new Produto();
		prod2.tipoProduto = "Tenis";
		prod2.valorProduto = 50.00;
		
		System.out.println("\n"+prod.tipoProduto);
		System.out.println("\n"+prod.valorProduto);
		System.out.println("\n"+prod.quantidade);
		linha();
		System.out.println("\n"+prod1.tipoProduto);
		System.out.println("\n"+prod1.valorProduto);
		System.out.println("\n"+prod.quantidade);
		linha();
		System.out.println("\n"+prod2.tipoProduto);
		System.out.println("\n"+prod2.valorProduto);
		System.out.println("\n"+prod.quantidade);
		linha();
		
		
	}
	public static void linha()
	{
		for(int x = 1;x<80;x++)
		{
			System.out.print("=");
		}
	}
	
}
