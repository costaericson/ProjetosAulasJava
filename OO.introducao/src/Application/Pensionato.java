package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.QuartosPPensionatos;

public class Pensionato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		QuartosPPensionatos [] quarto = new QuartosPPensionatos[10];
		
		System.out.print("quantos quartos voces v�o pegar? ");
		int e = in.nextInt();
		
		for(int i = 0;i<e;i++) {
			
			System.out.print("Qual quarto voce vai escolher? ");
			int q = in.nextInt();
			System.out.print("Qual seu nome? ");
			String nome = in.next();
			System.out.print("Qual seu email? ");
			String email = in.next();
			
			quarto[q] = new QuartosPPensionatos(nome, email);
					
		}
		
		for(int i = 0;i<quarto.length;i++) {
			if(quarto[i] != null) {
				System.out.println("Seus quartos s�o #0"+ i +": " + quarto[i]);
				
			}
		}
		
		
		
		
		
		in.close();
	}

}
