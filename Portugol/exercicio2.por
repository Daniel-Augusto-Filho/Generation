programa
{
	
	funcao inicio()
	{
		const inteiro ANO = 365
		inteiro dadosUsuario,resultado1,resultado2, resultado3

		escreva("insira quantos dias vc já viveu :")
		leia(dadosUsuario)
		resultado1 = dadosUsuario/ANO
		escreva(resultado1," anos ")
		resultado2 = (dadosUsuario%365)/30
		escreva (resultado2, " meses ")
		resultado3 = (dadosUsuario%365)%30
		escreva(resultado3," dias ")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 58; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */