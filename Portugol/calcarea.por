programa
{
	inclua biblioteca Matematica --> mat

	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		escreva("--------------------------------------------------------------------------------")
	}
	funcao circulo(real raio)
	{
		real formula = (raio*raio)*3.14
		escreva(raio)
		
		
	} retornar (real raio)
	
	
	funcao inicio()
	{
		inteiro opcao
		real area, altura, base
		const real PI = 3.14
		real raio,formula,formula1
		const real VALORFIXO = 2.0
		real areaReal
		
		escreva(" ESCOLHA PARA CALCULAR [1]CIRCULO\n")
		escreva(" ESCOLHA PARA CALCULAR [2]RETANGULO\n")
		escreva(" ESCOLHA PARA CALCULAR [3]TRIANGULO\n")
		
		leia(opcao)
		
		escolha (opcao) 
		{
			//caso 1 : circulo(raio)
			
			
			pare

		 	caso 2 :
			
			
				escreva(" insira base : " )
				leia(base)
				escreva(" insira a altura : ")
				leia(altura)
				limpa()
				area = (base*altura)
				escreva(" A ÁREA É DE : ",mat.arredondar(area, 2))
			
			pare
			
		 	caso 3 :
		 	    
		
				escreva( " INSIRA BASE : ")
				leia(base)
				limpa()
				escreva(" INSIRA ALTURA : ")
				leia(altura)
				limpa()
				area = (base*altura)
				areaReal =  (area/VALORFIXO)
				escreva(" A ÁREA DO TRIANGULO É : ",mat.arredondar(areaReal, 2))
			
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */