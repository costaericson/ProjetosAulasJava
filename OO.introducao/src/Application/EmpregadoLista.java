package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entidadeds.Empregado;

public class EmpregadoLista {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Empregado> lista = new ArrayList<Empregado>();
		int L = 11;
		
		
		System.out.print("quantos funcionarios ser�o registrados? ");
		int n = in.nextInt();
		
		for(int i = 0;i<n;i++) {
			System.out.println("Empregado #"+(i+1)+": ");
			System.out.print("ID: ");
			Integer id = in.nextInt();
			System.out.print("Nome: ");
			String nome = in.next();
			System.out.print("Salario: ");
			Double salario = in.nextDouble();
			
			
			
			
			
		}
		
		
		
		
		
		
		
		in.close();
	}

}
