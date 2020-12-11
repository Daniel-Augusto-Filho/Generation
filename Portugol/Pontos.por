programa
{
	
	funcao inicio()
	{
		inteiro maiorPonto = 0
		inteiro pontos[5]

		 para(inteiro x = 0;x<=4;x++)
		{
		  escreva(" Insira os numeros : ")
		  leia(pontos[x])
		  
		  }
		   para(inteiro x = 0;x<=4;x++)
		{
		  escreva(" Os valores são : ",pontos[x],"\n")
		  
		  	se(pontos[x]>maiorPonto)
		  	{
		  		maiorPonto= pontos[x]
		  	}
		  	}
		escreva("\n O MAIOR NUMERO É : ", maiorPonto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */