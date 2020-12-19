package Loja;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaMain 
{
	public static void main(String[] args)
	{
		Produto prod = new Produto();
		Menu menus = new Menu();
		Scanner leia = new Scanner(System.in);
		String op;
		int opc = 0;
		int opcao =0;
//VÁRIAVEIS ------------------------------------------------------------------------------------------------------------		
	
//INTERAÇÃO COM USER --------------------------------------------------------------------------------------------------		
		System.out.println("Digite seu nome :");
		Cliente c1 = new Cliente();
		c1.setNome(leia.next());
		System.out.println("Informe seu sexo M-masculino, F-feminino, O-outros");
		c1.setSexo(leia.next().toUpperCase().charAt(0));
		System.out.println("Digite seu ano de nascimento :");
		c1.setNascimento(leia.nextInt());
		System.out.println("Digite seu Cpf : ");
		c1.setCpf(leia.next());
		c1.boasVindas(c1.getSexo(),c1.getNome(),c1.getNascimento());
		
//LOOP DO MENU ----------------------------------------------------------------------------------------------------------------	
		while(opc != 6)
		{
			menus.menuOp();
			
			opc = leia.nextInt();
				
				switch(opc)
				{
				case 1: prod.comprar800(opcao);
					break;
				case 2: prod.comprar1200(opcao);
					break;
				case 3: prod.comprar1500(opcao);
					break;
				case 4:  prod.comprar1800(opcao);
					break;
				case 5:  prod.comprar2000(opcao);
					break;
				case 6: System.out.println("OBRIGADO POR USAR A D' STORE ");
					break;
					
			
			}
			
			
		}
		
	
		
		
		
		
		
		
	}
	
}
