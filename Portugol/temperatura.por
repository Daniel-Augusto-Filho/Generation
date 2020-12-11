programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{       
		   const real VALORFIXC = 1.8 //valor fixo da formula
		   real celsius //vai ser o valor inserido pelo user
		   const real VALORFIXF = 32.0 //outro valor fixo
		   real resultado
	        
	        escreva("Qual a temperatura ? ")
	        leia(celsius)//vai ler o valor digitado
	       resultado = celsius*VALORFIXC+VALORFIXF
	        escreva("A temperatura é " + Matematica.arredondar(resultado,2)+ " Fahrenheit")
	        
	        


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */