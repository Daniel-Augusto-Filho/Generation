public class Dados 
{
   public static void main(String[] args) 
	{
	   int lancamentos [] = new int [10];
       double media = 0.0, numero;
       int maiordado = 0;
       int contador =0;

       for(int x = 0; x < 10; x++)
       {
    	   lancamentos[x] = (int) (Math.random() * 6+1); 
    	   System.out.println(" DADOS JOGADOS : " + lancamentos[x] );
       }
       for( int g = 0; g < 10; g++)
       {	
    	   if( lancamentos[g] > maiordado )
    	   {
    		   maiordado = lancamentos[g];
    	   }
       }
       for(int contadora = 0; contadora<10;contadora++)
       {
    	   if(lancamentos[contadora]==maiordado)
    	   {
    		   contador++;
    	   }
       }
       System.out.println("O NUMERO MAIOR FOI "+ maiordado);
       System.out.println(" APARECEU "+ contador);
  } 
}