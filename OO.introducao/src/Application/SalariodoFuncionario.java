package Application;

import java.util.Locale;
import java.util.Scanner;

import Entidadeds.Salario;

public class SalariodoFuncionario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Salario s1 = new Salario();
		System.out.print("Nome: ");
		s1.nome = in.next();
		System.out.print("Salario Bruto: ");
		s1.salario = in.nextDouble();
		System.out.print("Taxa: ");
		s1.taxa = in.nextDouble();
		
		System.out.println("Empregado: " + s1.nome+", "+s1.SalarioLiquido());
		
		System.out.println("qual o aumento salarial? ");
		double per = in.nextDouble();
		s1.AumentoSalario(per);
		
		System.out.println("Salario atualizado: " +s1);
		
		in.close();
	}

}
