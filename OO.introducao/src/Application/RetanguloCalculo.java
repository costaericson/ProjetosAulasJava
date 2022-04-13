package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.Retangulo;

public class RetanguloCalculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println("Digite a altura e largura do retangulo: ");
		r1.altura = in.nextDouble();
		r1.largura = in.nextDouble();
		
		System.out.printf("A area é: %.2f\n", r1.area());
		System.out.printf("O perimetro é é: %.2f\n", r1.perimetro());
		System.out.printf("A Duiagonal é: %.2f\n", r1.diagonal());
		
		
		
		
		in.close();
	}

}
