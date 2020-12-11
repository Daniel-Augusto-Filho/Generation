import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) 
	{ 
		Scanner leia = new Scanner(System.in);
		double x1,x2,y1,y2,res1,res2,res3,res4;
		System.out.println("insira o primeiro valor : ");
		x2 = leia.nextDouble();
		System.out.println("insira o segundo valor : ");
		x1 = leia.nextDouble();
		res1 = (x2 - x1)*(x2 - x1);
		System.out.println("insira o terceiro valor : ");
		y2 = leia.nextDouble();
		System.out.println("insira o terceiro valor : ");
		y1 = leia.nextDouble();
		res2 = (y2 - y1)*(y2-y1);
		res3 = res1+res2;
		res4 = Math.sqrt(res3);
		System.out.println(" a distancia será de : " + Math.round(res4));
		
		
	}

}
