package banco;

public class Conta 
{
	private double saldo = 0;
	
	public void TiraSaldo(double saque)
	{
		if(this.saldo > 0)
		{
			if(saque <= saldo)
			{
				double roubaSaldo = saque - saldo;
				
			}
			else if(saque  > saldo)
			{
				System.out.println(" Saldo indisponivel  ");
			}
		}
		else if (this.saldo < 1)
		{
			System.out.println(" Saldo indisponivel  ");
		}
		 TiraMovimento();
		
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	//-------------------------------------------------------------------------------------------
	public int movimentos = 10;
	
	public void TiraMovimento()
	{
		int tirador = movimentos -1;
	}
	
	//--------------------------------------------------------------------------------------------
	public double depositar = 0;
	
	//--------------------------------------------------------------------------------------------
	public double limite = 1500;
	
	public void ColocaSaldo(double valors)
	{
		if(valors <= this.limite)
		{
			double poeNoSaldo = this.limite +this.saldo;
		}
		else if(valors > this.limite)
		{
			System.out.println("Valor indisponivel");
		}
		TiraMovimento();
	}
}
