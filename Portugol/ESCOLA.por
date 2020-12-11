programa
{
	cadeia alunos[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da Silva","Luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
     caracter sexoAlunos[39] = { 'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
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
	 
	   escreva(" \n█■■■■■■■■■■■■■ BEM VINDO AO APP G5 ESCOLA ■■■■■■■■■■■■■■■█ ","\n")
        escreva("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█","\n")
        escreva(" \n█■■■■■■■■■■■■■       1 -   GERAL          ■■■■■■■■■■■■■■■█ ","\n")
        escreva(" \n█■■■■■■■■■■■■■       2 - APROVADOS        ■■■■■■■■■■■■■■■█ ","\n")
	   escreva(" \n█■■■■■■■■■■■■■       3 - REPROVADOS       ■■■■■■■■■■■■■■■█ ","\n")
	   escreva(" \n█■■■■■■■■■■■■■       4 - MENOR NOTA       ■■■■■■■■■■■■■■■█ ","\n")
	   escreva("█■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█","\n")
	   leia(opcao)
	   
	   escolha(opcao)
	   {
	   	caso 1:
	   	geral()
	   	caso 2:
	   	
	   	caso 3:
	   	
	   	caso 4:
	   	
	   	 pare
	   }
	   
	}

 	funcao geral()
 	{
 		para(inteiro scan = 0; scan<39;scan++ )
 		{
 			nota[scan] = u
 			escreva("\n",alunos[scan]," ----> ",sexoAlunos[scan])
 		}
 	}
 	funcao aprovados()
 	{
 		
 	}
 	funcao reprovados()
 	{
 		
 	}
 	funcao menorNota()
     {    
     //se(nota[39]<menorNota){
     //menorNota =nota[39]
        }

     }
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2825; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */