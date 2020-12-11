programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{    
		const real VALORFIXO = 2.0
		real base, altura, area,areaReal
		escreva( " ISIRA BASE : ")
		leia(base)
		limpa()
		escreva(" ISIRA ALTURA : ")
		leia(altura)
		limpa()
		area = (base*altura)
		areaReal =  (area/VALORFIXO)
		escreva(" A ÁREA DO TRIANGULO É : ",m.arredondar(areaReal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */