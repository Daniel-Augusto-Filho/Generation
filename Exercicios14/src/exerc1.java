import java.util.Scanner;

public class exerc1 
{
public static void main(String[] args) 
{
	Scanner leia = new Scanner(System.in);
	Pessoa human = new Pessoa ();
	System.out.println("Digite seu Nome :");
	human.nome = leia.next();
	System.out.println("Digite sua Idade : ");
	human.idade = leia.nextInt();
	System.out.println("Digite o seu Sexo ");
	human.sexo = leia.next();
	System.out.println("SEU NOME É : ");
	System.out.println(human.nome);
	System.out.println("Sua idade é : ");
	System.out.println(human.idade);
	System.out.println("Seu genero é : " );
	System.out.println(human.sexo);
}
}
