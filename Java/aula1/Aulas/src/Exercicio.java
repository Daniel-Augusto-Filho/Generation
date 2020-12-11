import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args)
	{
		 Scanner leia = new Scanner(System.in);
	        int a,b,c,aR,bR,cR,vD;
	        System.out.println(" insira o dado A : ");
	        a = leia.nextInt();
	        System.out.println(" insira o dado B : ");
	        b = leia.nextInt();
	        System.out.println(" insira o dado C : ");
	        c = leia.nextInt();
	        aR = (a+b)*(a+b);
	        System.out.println(" O valor de R é : " + aR);
	        bR = (b+c)*(b+c);
	        System.out.println(" O valor de S é : " + bR);
	        vD = (aR+bR)/2;
	        System.out.println(" O valor de D é : " + vD );
	}

}
