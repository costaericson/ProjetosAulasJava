package Estruturas;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("escoljha um dia: ");
		int x = in.nextInt();
		
		String dia = "";
		
		switch(x) {
		case 1: 
			dia = "Domingo";
			break;
		case 2: 
			dia = "Segunda-Feira";
		}
		
		System.out.println(dia);
		
		
		
		
		
		in.close();
	}

}
