package bancos;

import java.util.Scanner;

public class BancoTeste {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		char op;
		char saida;
		int numeroConta = 0;
		double valorLimite = 5000;
		double emprestimo = 5000;
		double emprestimoUniversitario = 5000;
		final int QTDMOVIMENTO = 2;
	

		System.out.println("--------- G5-BANK ----------");
		for(int x =0;x<11;x++)
		{
			Menu menu = new Menu();
			menu.menuEntrada();
			op = t.next().charAt(0);
			if (op == '1') {
				
				menu.menuPrincipal();
				char opconta = t.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = t.next();
				switch (opconta) {
				case '1': {
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = t.nextInt();
					ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);

					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							poupanca.debito(valor);
							System.out.println("Saldo Atual: " + poupanca.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							poupanca.credito(valor);

							System.out.println("Saldo Atual: " + poupanca.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}

					}
					System.out.println("DIGITE O DIA DE HOJE!");
					int dia = t.nextInt();
					poupanca.comparacaoData(dia);

				}
					break;

				case '2': {
					ContaCorrente corrente = new ContaCorrente(numeroConta, cpfConta);
					
					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO \\ [T]- TALÃO");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							corrente.debito(valor);
							System.out.println("Saldo Atual: " + corrente.getSaldo());
							

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							corrente.credito(valor);

							System.out.println("Saldo Atual: " + corrente.getSaldo());
						}
						else if(opcao == 'T')
						{
							corrente.talao(numeroConta, opcao);
						}
						else 
						{
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}
						
					}
					
					
				}
					break;

				case '3': {
					ContaEspecial especial = new ContaEspecial(numeroConta, cpfConta, valorLimite);
					
					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							especial.debito(valor);
							System.out.println("Saldo Atual: " + especial.getSaldo());
							

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							especial.credito(valor);

							System.out.println("Saldo Atual: " + especial.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}
						
					}
				}
					break;

				case '4': {
					ContaEmpresa empresa = new ContaEmpresa(numeroConta, emprestimo);
					
					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO \\ [E]- EMPRÉSTIMO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							empresa.debito(valor);
							System.out.println("Saldo Atual: " + empresa.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							empresa.credito(valor);

							System.out.println("Saldo Atual: " + empresa.getSaldo());
						}
						else if (opcao == 'E')
						{
							empresa.emprestar(valorEmprestimo);
						}
						else {
							System.out.println("Insira um comando válido!! ");
						}
						
					}
					
					System.out.println("DESEJA FAZER UM EMPRESTIMO?");
					double valorEmprestimo = t.nextDouble();				
					empresa.emprestar(valorEmprestimo);
					
				}
					break;

				case '5': {
					ContaUniversitaria universitaria = new ContaUniversitaria(numeroConta, cpfConta, valorLimite,
							emprestimoUniversitario);
					
					for (int i = 0; i < QTDMOVIMENTO; i++) {
						System.out.println("QUAL OPERAÇÃO DESEJA FAZER? R$");
						System.out.println("[D]-DÉBITO \\ [C]-CRÉDITO ");
						char opcao = t.next().toUpperCase().charAt(0);

						if (opcao == 'D') {

							System.out.println("INSIRA O VALOR DO DÉBITO");
							double valor = t.nextDouble();
							universitaria.debito(valor);
							System.out.println("Saldo Atual: " + universitaria.getSaldo());

						} else if (opcao == 'C') {
							System.out.println("INSIRA O VALOR DO CRÉDITO");
							double valor = t.nextDouble();
							universitaria.credito(valor);

							System.out.println("Saldo Atual: " + universitaria.getSaldo());
						} else {
							System.out.println("Insira um comando válido!! [D]-DÉBITO \\\\ [C]-CRÉDITO");

						}
						
					}
					
				}
					break;
				}

			} else if (op == '2') {
				System.out.println("wip");
			} else {

			}
			System.out.println("Continua S/N");
			saida = t.next().toUpperCase().charAt(0);
			if (saida == 'N') {
				System.out.println("PROGRAMA FINALIZADO..");
				break;
			}

		}
		System.out.println("NUMERO DE OPERAÇÕES CONCLUIDAS");

	}
}