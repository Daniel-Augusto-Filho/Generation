import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		String op = null;
		int op1 = 0;
		char opc = 0;
		char sair = 'n';
		Collection <String> produtos = new ArrayList();
		Menu menu = new Menu();
		do {
			
		menu.menuOp();
		op1 = input.nextInt();
		
		
			
				switch(op1)
				{
				case 1: do
				{
					System.out.println("Digite o nome do Produto :");
					op = input.next();
					produtos.add(op);
					System.out.println("Deseja continuar [S]- Sim [N]- Não ");
					opc = input.next().toUpperCase().charAt(0);
				
				}while(opc == 'S');
				
				break;
				case 2: do
				{
					String remover;
					System.out.println("Digite o nome do Produto que quer remover :");
					remover = input.next();
					produtos.remove(remover);
				}
				while(opc == 'S');
					break;
				
				case 3:
					System.out.println(produtos);
					break;
				case 4:
					System.out.println(produtos);
					break;
		
				}
		}while(opc =='N');
	
			
		
	}
}
