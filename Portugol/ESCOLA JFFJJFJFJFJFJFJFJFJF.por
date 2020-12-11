programa
{
	inclua biblioteca Util --> sorte
	
	cadeia alunos[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
     caracter sexo[39] = { 'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
	cadeia matricula[39] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39"}
	cadeia reprovado[39]
	real nota [39]
	caracter rA = 'X' 
	inteiro rA1 = 111
	inteiro ra2
	real menorNota1 = 11.0
	
	
	

	funcao inicio()
	{
		 leitorDeRa()
		 
		 
	}

	funcao leitorDeRa()
	
	{
		 escreva(" \n█■■■■■■■■■■■■■ BEM VINDO AO APP G5 ESCOLA ■■■■■■■■■■■■■■■█ ","\n")
           escreva("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█","\n")
           escreva("\n█■■■■■■■■■■■■■■ INSIRA O R.A ESTUDANTIL ■■■■■■■■■■■■■■■■■█ \n")
           leia(ra2)
           limpa()
           se(ra2==rA1)
           {
           	menuPrincipal()
           }senao
           {
           	leitorDeRa()
           }
           
     }
     
	funcao menuPrincipal()
	{

	   limpa()
	   inteiro opcao = 0
	   limpa()
	 
	   escreva(" \n█■■■■■■■■■■■■■ BEM VINDO AO APP G5 ESCOLA ■■■■■■■■■■■■■■■█ ")
        escreva("\n█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█")
        escreva(" \n█■■■■■■■■■■■■■       1 -   GERAL          ■■■■■■■■■■■■■■■█ ","\n")
        escreva(" \n█■■■■■■■■■■■■■       2 - MASCULINO        ■■■■■■■■■■■■■■■█ ","\n")
        escreva(" \n█■■■■■■■■■■■■■       3 - FEMININO         ■■■■■■■■■■■■■■■█ ","\n")
        escreva(" \n█■■■■■■■■■■■■■       4 - APROVADOS        ■■■■■■■■■■■■■■■█ ","\n")
	   escreva(" \n█■■■■■■■■■■■■■       5 - REPROVADOS       ■■■■■■■■■■■■■■■█ ","\n")
	   escreva(" \n█■■■■■■■■■■■■■       6 - MENOR NOTA       ■■■■■■■■■■■■■■■█ ","\n")
	   escreva("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█","\n")
	   leia(opcao)
	   
	   escolha(opcao)
	   {
	   	caso 1:
	    geral ()
	   	caso 2:
	   	
	   	caso 3:
	   	
	   	caso 4:
	   	aprovados()
	   	caso 5:

	   	caso 6:
	   	
	   	 pare
	   }
	   
	}

 	funcao geral()
 	{
 		para(inteiro scan = 0; scan<39;scan++ )
 		{
 			nota[scan] = sorte.sorteia(0,10)
 			escreva("\n","G5- ",alunos[scan]," ----> ", "\n", nota[scan])
 		}
 	}
 	
 	funcao aprovados()
 	{
 		cadeia armazenador
 			para(inteiro scan = 0; scan<39;scan++ )
 		{
 		   se(nota[scan]<7)
 		   {
 		   	armazenador = " REPROVADO")
 		   }
 		   senao
 		   {
 		   	armazenador = " APROVADO "
 		   }
 		   
 		   escreva (alunos[scan],"\n",armazenador,"\n" )
 		}
 		 			
		
	}
	
	

	funcao reprovados()
 	{
 		
 	}
 	
 	funcao menorNota()
     {    
  
        }

     }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */