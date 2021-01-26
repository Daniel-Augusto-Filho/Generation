package bancoEspecial;
import java.util.Scanner;

public class BancoEp 
{
	public static void linha(int tamanho) 
	{
        for(int x=0; x<tamanho; x++) 
        {
            System.out.print("💸");
        }
	}
	public static void pula()
	{
		System.out.println("\n");
	}
    public static char menuInicial(Scanner leia) 
    {
    	 linha(15);
         pula();
         System.out.println("[1] - MOVIMENTAÇÃO");
         System.out.println("[2] - SALDO");
         System.out.println("[3] - SAIR");
         linha(15);            
         char resposta = leia.next().charAt(0);
         
         return resposta;
    }
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in); 
		
		double movimentos[] = new double[10];
		
		char debitoCredito = 0;
		char continuaLoop = 0;
		double credito=0, debito = 0;
		double saldo=0, limiteSaldo = 10000.0;
		char continuaMenu = 0;
		String cliente = "" ;
		int conta = 0;
		
		
		do{
		switch(menuInicial(leia))
				{
			case '1':
			{	
				for(int i=0; i<10; i++){
					System.out.println("MOVIMENTAÇÃO "+ (i+1)+ " - [D]DÉBITO OU [C] CRÉDITO");
					debitoCredito = leia.next().toUpperCase().charAt(0);
					if(debitoCredito == 'D') {
						System.out.println("DIGITE O VALOR DO DÉBITO: R$");
						debito = leia.nextDouble();
						if(saldo >= debito) {
							if(i == 9){
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);

							}else{
								movimentos[i]= (-debito);
								saldo += movimentos[i];
								System.out.println("SALDO ATUAL: R$ "+saldo);
								System.out.println("DESEJA CONTINUAR? S/N");
								continuaLoop = leia.next().toUpperCase().charAt(0);
									if(continuaLoop == 'N'){
										break;	
									}
							}
						}else if(saldo < debito) {	
							if((saldo+limiteSaldo) >= debito) {
								if(i == 9){		
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									limiteSaldo += (-debito);
									movimentos[i]= (-debito);
									saldo += movimentos[i];
									System.out.println("SALDO ATUAL: R$"+saldo);
									System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							} else {
								if(i == 9){		
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
									continuaMenu = leia.next().toUpperCase().charAt(0);
								} else {
									pula();
									System.out.println("SALDO INSULFICIENTE");
									System.out.println("DESEJA CONTINUAR? S/N");
									continuaLoop = leia.next().toUpperCase().charAt(0);
										if(continuaLoop == 'N'){
											break;
										}
								}
							}
							
						}
					}else if(debitoCredito == 'C') {
							if(i == 9) {
								System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
								credito = leia.nextDouble();
								movimentos[i] = credito;
								saldo += movimentos[i];
								System.out.println("MOVIMENTAÇÕES ENCERRADAS.");
								linha(12);
								System.out.println("DESEJA RETORNAR AO MENU INICIAL? S/N");
								continuaMenu = leia.next().toUpperCase().charAt(0);
							}
						System.out.println("DIGITE O VALOR DO CRÉDITO: R$");
						credito = leia.nextDouble();
						movimentos[i] = credito;
						saldo += movimentos[i]; 
						System.out.println("DESEJA CONTINUAR? S/N");
						continuaLoop = leia.next().toUpperCase().charAt(0);
							if(continuaLoop == 'N'){
								break;								
							}
					}									
				}
			break;
			}

			case '2' : 
				System.out.println("NOME DO CLIENTE: "+ cliente);
				System.out.println("NÚMERO DA CONTA: "+ conta);
				System.out.println("SALTO ATUAL: "+ saldo);
				System.out.println("LIMITE DISPONÍVEL: R$"+limiteSaldo);
				System.out.println("DESEJA VOLTAR AO MENU INICIAL? S/N");
				continuaMenu = leia.next().toUpperCase().charAt(0);
		       break;
			
			case '3' : 
				System.out.println("OBRIGADO POR UTILIZAR O G1-BANK");
				continuaMenu = 'N';
				continuaLoop = 'S';
				break;
			
			}
		}while(continuaMenu == 'S' ||  continuaLoop == 'N');
		
		
	}
	
}


