programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

		real x1,x2,y1,y2,res1,res2,res3,res4
		escreva("insira o primeiro valor : ")
		leia(x2)
		escreva(" insira o segundo valor : ")
		leia(x1)
		res1 = (x2 - x1)*(x2 - x1)
		escreva(" insira o terceiro valor : ")
		leia(y2)
		escreva(" insira o quarto valor : ")
		leia(y1)
		res2 = (y2 - y1)*(y2-y1)
		res3 = res1+res2
		res4 = Matematica.raiz(res3, 2.0)
		escreva(" a distancia será de : ", Matematica.arredondar(res4, 2))
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */