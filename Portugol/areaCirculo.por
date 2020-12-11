programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{ 
		const real PI = 3.14
		real raio,formula,formula1
		

		escreva(" INSIRA O RAIO : ")
		leia(raio)
		limpa()
		formula = (raio)*(raio)
		formula1 = (formula*PI)
		escreva(" A área do circulo é : ",mat.arredondar(formula1, 2))
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */