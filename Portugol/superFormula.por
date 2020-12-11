programa
{
	
	funcao inicio()
	{
		inteiro a,b,c,d,e1,f,c2,f2,x,y,x1,y2,res1,res2,res3,res4
		escreva("insira um dado a ")
		leia(a)
	     escreva(" insira um dado x ")
	     leia(x)
	     escreva(" insira um dado b ")
	     leia(b)
	     escreva(" insira um dado y ")
	     leia(y)
	     res1 = (a*x)+(b*y) //vai dar o resultado pro C
	     escreva("insira um dado")
	     leia(d)
	     escreva("insira um dado")
	     leia(e1)
	     res2 = (d*x)+(d*y) //vai dar o resultado para f
	     res3 = ((res1*e1)-(b*res2))/((a*e1)- (b*d)) // resultado de X
	     res4 = ((a*res2)-(res1*d))/((a*e1)-(b*d))
	     
	     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */