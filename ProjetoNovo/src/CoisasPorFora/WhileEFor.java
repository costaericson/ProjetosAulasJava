package CoisasPorFora;

import java.util.Scanner;

public class WhileEFor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("TABUADAS!!!");
		System.out.println("DESEJA VER UMA TABUADA ? [S OU N] ");
		String decisao = in.next();
		
		while (decisao.equalsIgnoreCase("s")) {
			System.out.println("RESPOSTA: " + decisao);
			System.out.print("TABUADA DE: S");
			int n = in.nextInt();
			System.out.println();
			System.out.printf(" %d x 1 = %d\n ", n, (n*1));
			System.out.printf("%d x 2 = %d\n ", n, (n*2));
			System.out.printf("%d x 3 = %d\n ", n, (n*3));
			System.out.printf("%d x 4 = %d\n ", n, (n*4));
			System.out.printf("%d x 5 = %d\n ", n, (n*5));
			System.out.printf("%d x 6 = %d\n ", n, (n*6));
			System.out.printf("%d x 7 = %d\n ", n, (n*7));
			System.out.printf("%d x 8 = %d\n ", n, (n*8));
			System.out.printf("%d x 9 = %d\n ", n, (n*9));
			
			System.out.println("DESEJA VER UMA TABUADA ? [S OU N] ");
			
			decisao = in.next();
			
		}
		System.out.println("ATE MAIS ");
		
		
		
		
		
		
		in.close();
	}

}
