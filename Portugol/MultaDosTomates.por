programa
{
	
	funcao inicio()
	{ 
		const real EXCESSO = 50.0
		const real MULTA = 4.00
		real pesoDoTomate,excessoPeso,formula,formulab

		escreva(" insira o peso do tomate : ")
		leia(pesoDoTomate)
		limpa()

		se(pesoDoTomate <= 50)
		{
			escreva( " Não há multa " )
			 
		}
		senao{

			formulab = pesoDoTomate - EXCESSO 
			formula = (pesoDoTomate-EXCESSO)*MULTA
			escreva(" Havera multa de : ",formula," R$ o peso excedido foi de :",formulab)
			}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */