package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.Dolar;

public class ComprarDolar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Qual o preco do DOLLAR? ");
		double valor = in.nextDouble();
		System.out.print("Quantos dollars voce vai comprar? ");
		double d = in.nextDouble();
		
		double total = Dolar.ConverterDolar(valor, d);
		
		System.out.println("O valor total a ser pago será: "+ total);
		
		
		
		
		
		in.close();
	}

}
