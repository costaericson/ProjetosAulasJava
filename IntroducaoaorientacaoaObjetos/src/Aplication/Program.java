package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digete as medidas do triangula A: ");
		xA  = in.nextDouble();
		xB  = in.nextDouble();
		xC  = in.nextDouble();
		System.out.println("Digite as medidas do triangulo B: ");
		yA = in.nextDouble();
		yB = in.nextDouble();
		yC = in.nextDouble();
		
		double p = (xA+xC+xB)/2;
		double areaX = Math.sqrt(p* (p-xA)*(p-xB)*(p-xC));
		
		double p = (xA+xC+xB)/2;
		double areaY = Math.sqrt(p* (p-yA)*(p-yB)*(p-yC));
		
		System.out.printf(" A area do triangula X �: %.4f%n", areaX);
		System.out.printf(" A area do triangula X �: %.4f%n", areaY);
		
		
		
		
	}

}
