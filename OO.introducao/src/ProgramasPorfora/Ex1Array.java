package ProgramasPorfora;

import java.util.Locale;
import java.util.Scanner;

public class Ex1Array {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);
		
		System.out.println("Qunatas alturas ser?o analisadas? ");
		int n = in.nextInt();
		
		double [] vetor = new double[n];
		
		for(int i = 0;i<vetor.length;i++ ) {
			vetor[i] = in.nextDouble();
		}
		
		double sum = 0;
		for(int i =0;i<vetor.length;i++) {
			sum += vetor[i];
		}
		System.out.println(sum/vetor.length);
		
		in.close();
	}

}
