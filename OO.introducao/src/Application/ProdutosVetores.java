package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.ProdutospVetores;

public class ProdutosVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ProdutospVetores [] pro = new ProdutospVetores[n];
		double media = 0;
		for(int i = 0;i<pro.length;i++) {
			String nome = in.next();
			double preco = in.nextDouble();
			pro[i] = new ProdutospVetores(nome, preco);
			
			media += pro[i].getPreco();
		}
		
		System.out.printf("A media foi: %.2f\n",(media/pro.length));
		
		
		in.close();
	}

}
