import java.util.Scanner;

public class Exercicio3A {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int TempoSegundo;
		int horas, segundos, minutos;
		
		System.out.println("Quantos tempo em segundos?");
		TempoSegundo = entrada.nextInt();
		
		//processamentos
		horas = TempoSegundo/ 3600;
		minutos = (TempoSegundo % 3600) /60;
		segundos = (TempoSegundo % 3600) % 60;
		
		System.out.println("Horas " + horas + " Minutos " + minutos + " Segundos" + segundos);
		
	}
}
