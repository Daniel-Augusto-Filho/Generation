funcao geral()
     {
         para(inteiro scan = 0; scan<39;scan++ )
         {   nota[scan]=Util.sorteia(1,10)


         se( nota[scan]>7){
             situacao = "Aprovado"
         }senao{
             situacao = "Reprovado"
             }



             escreva("\n",alunos[scan]," ----> ",sexoAlunos[scan]+" - As notas sao "+ nota[scan]+" e ele foi "+situacao)
         }
     }
cadeia situacao = "x"
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */