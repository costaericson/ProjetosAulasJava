package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.Triangulo;

public class Programtriangulo {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner in = new Scanner(System.in);
//			double xA, xB, xC, yA, yB, yC;
//			
//			System.out.println("Digete as medidas do triangula X: ");
//			xA  = in.nextDouble();
//			xB  = in.nextDouble();
//			xC  = in.nextDouble();
//			System.out.println("Digite as medidas do triangulo Y: ");
//			yA = in.nextDouble();
//			yB = in.nextDouble();
//			yC = in.nextDouble();
//			
//			double p = (xA+xC+xB)/2;
//			double areaX = Math.sqrt(p* (p-xA)*(p-xB)*(p-xC));
//			
//			double b = (yA+yC+yB)/2;
//			double areaY = Math.sqrt(b* (b-yA)*(b-yB)*(b-yC));
//			
//			System.out.printf(" A area do triangula X �: %.4f%n", areaX);
//			System.out.printf(" A area do triangula Y �: %.4f%n", areaY);
//			
//			
//			if(areaX>areaY) {
//				System.out.println("Maior area : X");
//			}else {
//				System.out.println("maior area : Y");
//			}
//			
			Triangulo x = new Triangulo();
			Triangulo y = new Triangulo();
			System.out.println("Digete as medidas do triangula X: ");
			x.a = in.nextDouble();
			x.b = in.nextDouble();
			x.c = in.nextDouble();
			System.out.println("Digite as medidas do triangulo Y: ");
			y.a = in.nextDouble();
			y.b = in.nextDouble();
			y.c = in.nextDouble(); 
			
			double areaX = x.area();
			double areaY = y.area();
			
			
			
			if (areaX>areaY) {
				System.out.println("A area maior �: X");
			}else {
				System.out.println("A area maior �: X");
			}
			
			
			
			in.close();
			
		}

			
			
			
			
}
