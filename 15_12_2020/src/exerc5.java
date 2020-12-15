
public class exerc5 
{
	public static void main(String[] args) 
	{
		Operario op = new Operario();
		op.comicao = 400;
		op.nome = "Pedro";
		op.valorProducao = 2000;
		op.setEndereco("Rua capixaba");
		op.setNumero(12453875);
		op.setSalario(5000);
		
		System.out.println("Nome: "+op.nome);
		System.out.println("Comição : " +op.comicao);
		System.out.println("Endereço : " + op.getEndereco());
		System.out.println("Numero : "+ op.getNumero());
		System.out.println("Salario : " + op.getSalario());
		System.out.println("Valor produto :" + op.valorProducao);
	}
}
