package com.conta.mentorama;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.conta.mentorama.classes.Conta;
import com.conta.mentorama.classes.ContaCorrente;
import com.conta.mentorama.classes.ContaPoupanca;
import com.conta.mentorama.classes.ContaSalario;

public class app {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("***** Banco Mentorama ** R$ **************");
		System.out.println("Menu de Opção para você Cliente amigo !");

		System.out.println(" 1 - Criar Conta ");
		System.out.println(" 2 - Sacar ");
		System.out.println(" 3 - Depositar");
		System.out.println(" 4 - Criar Cliente");
		System.out.println(" 5 - Transferir valores");
		System.out.println(" 6 - Mostrar montante disponivel nas contas");
		System.out.println(" 7 - sair");

		System.out.println(" Escolha a opção desejada :");

		System.out.println("Digita sua Opção : ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Scanner tconta = new Scanner(System.in);
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Salario");
			System.out.println("3 - Conta Poupança");
			System.out.println("4 - Conta Juridica");
			System.out.println("Tipo de Conta");
			int val = tconta.nextInt();
			
			switch (val) {
			case 1:	
				 int opcao01 = 0;
				do {
					System.out.println("**************** Bem Vindo Abra Sua Conta Corrente *****************");
					
					@SuppressWarnings("resource")
					Scanner nomeContaCorrente= new Scanner(System.in);
					System.out.println("Digite o nome do Titular :");
					String recebNomeConta = nomeContaCorrente.next();
					
					@SuppressWarnings("resource")
					Scanner cpfContaCorrente = new Scanner(System.in);
					System.out.println("Digite o CPf :");
					String recebCpfConta = cpfContaCorrente.next();
					
					@SuppressWarnings("resource")
					Scanner saldoContaCorrente = new Scanner(System.in);
					System.out.println("Digite o Saldo :");
					double recebSaldoContaCorrente = saldoContaCorrente.nextDouble();
	
					int digitoConta = new Random().nextInt(10) + 1;
					int contadousuario = new Random().nextInt(100) + 1188;
					
					int digitoAgencia = new Random().nextInt(10) + 1;
					int agenciaDoUsuario = new Random().nextInt(100) + 1188;
					
					contas.add(new ContaCorrente(agenciaDoUsuario, digitoAgencia, recebSaldoContaCorrente, recebCpfConta, recebCpfConta));
					
					System.out.println("Nome Do Titular: " + recebNomeConta + "  CPF DO Titular: " + recebCpfConta
							+ " Sua conta CC: " + contadousuario + "-" + digitoConta+"   " +"Sua Agencia: "+agenciaDoUsuario+"-"+ digitoAgencia
							+"  Digite o saldo inicial R$:  "+ recebSaldoContaCorrente);
					
					@SuppressWarnings("resource")
					Scanner escolhas = new Scanner(System.in);
					System.out.println("Deseja criar um nova conta ?");
					System.out.println("1 para Não | Numero maior que 1 para Sim");
					 opcao01 = escolhas.nextInt();			
				} while ( opcao01 != 1);
					System.out.println("você saiu");
				break;

			case 2:
				
				int opcao02 = 0;
				do {
					System.out.println("**************** Bem Vindo Abra Sua Conta Salario *****************");
					
					@SuppressWarnings("resource")
					Scanner nomeContaSalario= new Scanner(System.in);
					System.out.println("Digite o nome do Titular :");
					String recebNomeConta = nomeContaSalario.next();
					
					@SuppressWarnings("resource")
					Scanner cpfContaSalario = new Scanner(System.in);
					System.out.println("Digite o CPf :");
					String recebCpfConta = cpfContaSalario.next();
	
					@SuppressWarnings("resource")
					Scanner saldoContaSalario = new Scanner(System.in);
					System.out.println("Digite o Saldo :");
					double recebSaldoContaSalario = saldoContaSalario.nextDouble();
					
					int digitoContaSalario = new Random().nextInt(100) + 10;
					int contaContaSalariodousuario = new Random().nextInt(100) + 1188;
					
					int digitoAgencia = new Random().nextInt(10) + 1;
					int agenciaDoUsuario = new Random().nextInt(100) + 1188;
					
					contas.add(new ContaSalario(agenciaDoUsuario, contaContaSalariodousuario, recebSaldoContaSalario, recebCpfConta, recebCpfConta));
					
					System.out.println("Nome Do Titular: " + recebNomeConta + "  CPF DO Titular: " + recebCpfConta
							+ " Sua conta CC:" + contaContaSalariodousuario + "-" + digitoContaSalario+"   " +"Sua Agencia: "+agenciaDoUsuario+"-"+ digitoAgencia);
					
					@SuppressWarnings("resource")
					Scanner escolhas02 = new Scanner(System.in);
					System.out.println("Deseja criar um nova conta ?");
					System.out.println("1 para Não | Numero maior que 1 para Sim");
					 opcao02 = escolhas02.nextInt();			
				}while (opcao02 != 1);
					System.out.println("você saiu");
				
				break;

			case 3:
				 int opcao03 = 0;
					do {
						System.out.println("**************** Bem Vindo Abra Sua Conta Poupanca *****************");
						
						@SuppressWarnings("resource")
						Scanner nomeContaPoupanca= new Scanner(System.in);
						System.out.println("Digite o nome do Titular :");
						String recebNomeConta = nomeContaPoupanca.next();
						
						@SuppressWarnings("resource")
						Scanner cpfContaPoupanca = new Scanner(System.in);
						System.out.println("Digite o CPf :");
						String recebCpfContaPoupanca = cpfContaPoupanca.next();
						
						@SuppressWarnings("resource")
						Scanner saldoContaPoupanca = new Scanner(System.in);
						System.out.println("Digite o Saldo :");
						double recebSaldoContaPoupanca = saldoContaPoupanca.nextDouble();
		
						int digitoContaPoupanca = new Random().nextInt(10) + 1;
						int contadousuarioPoupanca = new Random().nextInt(100) + 1188;
						
						int digitoAgenciaPoupanca = new Random().nextInt(10) + 1;
						int agenciaDoUsuarioPoupanca = new Random().nextInt(100) + 1188;
						
						contas.add(new ContaPoupanca(agenciaDoUsuarioPoupanca, digitoAgenciaPoupanca, recebSaldoContaPoupanca, recebCpfContaPoupanca, recebCpfContaPoupanca));
						
						System.out.println("Nome Do Titular: " + recebNomeConta + "  CPF DO Titular: " + recebCpfContaPoupanca
								+ " Sua conta CC: " + contadousuarioPoupanca + "-" + digitoContaPoupanca+"   " +"Sua Agencia: "+agenciaDoUsuarioPoupanca+"-"+ digitoAgenciaPoupanca
								+"  Digite o saldo inicial R$:  "+ recebSaldoContaPoupanca);
						
						@SuppressWarnings("resource")
						Scanner escolhas = new Scanner(System.in);
						System.out.println("Deseja criar um nova conta ?");
						System.out.println("1 para Não | Numero maior que 1 para Sim");
						 opcao03 = escolhas.nextInt();			
					} while ( opcao03 != 1);
						System.out.println("você saiu");
				break;
			case 4:
				int opcao04 = 0;
				do {
					System.out.println("**************** Bem Vindo Abra Sua Conta Juridica *****************");
					
					@SuppressWarnings("resource")
					Scanner nomeContaJuridica= new Scanner(System.in);
					System.out.println("Digite o nome do Titular :");
					String recebNomeContaJuridica = nomeContaJuridica.next();
					
					@SuppressWarnings("resource")
					Scanner cpfContaJuridica = new Scanner(System.in);
					System.out.println("Digite o CNPJ :");
					String recebCpfContaJuridica = cpfContaJuridica.next();
					
					@SuppressWarnings("resource")
					Scanner saldoContaJuridica = new Scanner(System.in);
					System.out.println("Digite o Saldo :");
					double recebSaldoContaJuridica = saldoContaJuridica.nextDouble();
	
					int digitoContaJuridica = new Random().nextInt(10) + 1;
					int contadousuarioJuridica = new Random().nextInt(100) + 1188;
					
					int digitoAgenciaJuridica = new Random().nextInt(10) + 1;
					int agenciaDoUsuarioJuridica = new Random().nextInt(100) + 1188;
					
					contas.add(new ContaPoupanca(agenciaDoUsuarioJuridica, digitoAgenciaJuridica, recebSaldoContaJuridica, recebCpfContaJuridica, recebCpfContaJuridica));
					
					System.out.println("Nome Do Titular: " + recebNomeContaJuridica + "  CPF DO Titular: " + recebCpfContaJuridica
							+ " Sua conta CC: " + contadousuarioJuridica + "-" + digitoContaJuridica +"   " +"Sua Agencia: "+agenciaDoUsuarioJuridica +"-"+ digitoAgenciaJuridica
							+"  Digite o saldo inicial R$:  "+ recebSaldoContaJuridica);
					
					@SuppressWarnings("resource")
					Scanner escolhas = new Scanner(System.in);
					System.out.println("Deseja criar um nova conta ?");
					System.out.println("1 para Não | Numero maior que 1 para Sim");
					 opcao04 = escolhas.nextInt();			
				} while ( opcao04 != 1);
					System.out.println("você saiu");
				break;

			default:
				if (opcao >= 5) {

					System.out.println("opa numero fora da opção :");
				}
				break;
			}
			System.out.println(val);
			break;
		case 2:
			
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:
			System.out.println("Você saiu do menu !!! ");
			break;
		}

		entrada.close();

	}
	

}
