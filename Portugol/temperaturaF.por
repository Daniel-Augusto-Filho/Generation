programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	 	const real VALORFIX = 0.5555555556
	 	const real VALORFIX2 = 32.0
	 	real farenheit
	 	real formula

	 	escreva("qual sua temperatura ? ")
	 	leia(farenheit)
	 	formula = (farenheit-VALORFIX2)*VALORFIX
	 	escreva (Matematica.arredondar(formula,2))
	      	
	 	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */