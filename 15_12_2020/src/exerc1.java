
public class exerc1 
{
		public static void main(String[] args) 
		{
			Pessoa peso1 = new Pessoa();
			peso1.nome = "pedro ";
			peso1.setEndereco("Rua Abra�o Miguel do carmo ");
			peso1.setNumero(1199740162);
			System.out.println("Seu nome � "+peso1.nome+" mora na "+ peso1.getEndereco()+" e seu numero � "+peso1.getNumero());
			
			
		}
}
