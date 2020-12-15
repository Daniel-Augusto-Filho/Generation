
public class Exerc4 
{
	public static void main(String[] args) 
	{
		Administrador adm = new Administrador();
		adm.ajudaDeCusto = 1000;
		adm.nome = "Pedro";
		adm.setEndereco("Rua Sao Joaquim");
		adm.setNumero(112435344);
		adm.setSalario(15300);
		adm.funcao = "ADM MASTER";
		System.out.println("Seu nome é " + adm.nome);
		System.out.println("Seu salario é de " + adm.getSalario());
		System.out.println("Voce mora na "+ adm.getEndereco());
		System.out.println("Seu numero de telefone é : " +adm.getNumero());
		System.out.println("Seu salário é de : "+ adm.getSalario());
		System.out.println("A ajuda de custo é de : " + adm.ajudaDeCusto);
	}
}
