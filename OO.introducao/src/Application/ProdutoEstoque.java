package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.Produto;

public class ProdutoEstoque {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
//		Produto p1 = new Produto();

		System.out.println("Escreva o nome, pre?o e quantidade de itens deseja adicionar: ");
		String nome = in.next();
		double preco = in.nextDouble();
		int quantidade = in.nextInt();
		Produto p1 =new Produto(nome, preco, quantidade);

		System.out.printf("Informa??oe: %s, R$ %.2f, %d unidades, Total: %.2f \n" + p1);

		System.out.print("Gostaria de adicionar uma quantidade? S/N");
		String escolha = in.next();

		if (escolha.equalsIgnoreCase("S")) {
			System.out.print("Quanto gostaria de adicionar? ");
			int add = in.nextInt();
			p1.AddProduto(add);
		}
		System.out.printf("Informa??oe Atualizadas: %s, R$ %.2f, %d unidades, Total: %.2f \n", p1.nome, p1.preco,
				p1.quantidade, p1.ValorTotalemEstoque());
		System.out.print("Gostaria de remover uma quantidade? S/N");
		escolha = in.next();

		if (escolha.equalsIgnoreCase("S")) {
			System.out.print("Quanto gostaria de remover? ");
			int add = in.nextInt();
			p1.RemoveProduto(add);
		}
		System.out.println("o valor total deu: " + p1.ValorTotalemEstoque());

		in.close();
	}

}
