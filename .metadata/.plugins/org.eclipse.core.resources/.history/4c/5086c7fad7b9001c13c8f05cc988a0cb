package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.ContaBancaria;

public class ContaCliente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		System.out.print("Numero da conta bancaria: ");
		int cont = in.nextInt();
		c1.setConta(cont);
		System.out.print("Nome do titular: ");
		String nome = in.next();
		c1.setNome(nome);
		System.out.print("Gostaria de fazer um deposito inicial? S?N");
		String escolha = in.next();
		if (escolha.equalsIgnoreCase("s")) {
			System.out.print("Qual o valor gostaria de depositar? ");
			double valor = in.nextDouble();
			c1.setSaldo(valor);

		}
		System.out.println("Senhor(a): " + c1.getNome() + " o seu saldo é de: R$" + c1.getSaldo());
		System.out.print("Gostaria de fazer umais uma operação? ");
		escolha = in.next();
		while (escolha.equalsIgnoreCase("sim")) {
			System.out.print("Gostaria de fazer um deposito ou um saque? ");
			escolha = in.next();
			if (escolha.equalsIgnoreCase("deposito")) {
				System.out.print("Qual o valor gostaria de depositar? ");
				double valor = in.nextDouble();
				c1.Deposito(valor);

			} else {
				System.out.print("Qual valor gostaria de sacar? ");
				double valor = in.nextDouble();
				c1.Saque(valor);
			}
			System.out.println("Senhor(a): " + c1.getNome() + " o seu saldo é de: R$" + c1.getSaldo());
			System.out.print("Gostaria de fazer umais uma operação? ");
			escolha = in.next();
		}
		System.out.print("è um prazer tê-lo aqui!");

		in.close();
	}

}
