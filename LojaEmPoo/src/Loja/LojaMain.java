package Loja;

import java.util.Scanner;

public class LojaMain 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		String op;
		
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
		Produto prod = new Produto();
		prod.menuOp();
		op = leia.next();
		
		do 
		{
		switch(op)
		{
		case "g1" :int op1  = 0; 
			prod.comprar800(op1);
			break;
		case "g2" : int op2 = 0;
			prod.comprar1000(op2);
			break;
		case "g3" : int op3 = 0;
			prod.comprar1200(op3);
			break;
		case "g4" : int op4 = 0;
			prod.comprar1800(op4);
			break;
		case "g5" : int op5 = 0;
			prod.comprar2000(op5);
			break;
		case "6" : 
			System.out.println(" Agredeçemos a sua visita ....");
			break;
		 }
		}while(op !="6");
				
		
		
		
	}
	
}
