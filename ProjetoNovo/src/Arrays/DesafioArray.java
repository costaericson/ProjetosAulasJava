package Arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int u;
		System.out.print("Digite a quantidade de notas: ");
		u = in.nextInt();
		double [] notas = new double [u];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite sua nota numero #" + i +" ");
			notas [i] = in.nextDouble();
			
		}
		double media = 0;
		for(double soma: notas) {
			media += soma;
		}
		
		System.out.println("A media foi: " + media/notas.length);
		
		
		
		in.close();
	}
	
	

}
