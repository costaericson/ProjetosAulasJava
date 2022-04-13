package Arrays;

import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("A quantidade de alunos? ");
		int qtdAluno = in.nextInt();
		System.out.print("A quantidade de notas poor aluno? ");
		int qtdNotas = in.nextInt();
		
		double [] [] notasDaTurma = new double [qtdAluno] [qtdNotas];
		
		double soma = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Digite a nota %d do aluno %d ", j, i);
				
				notasDaTurma[i][j] = in.nextDouble();
				
				soma += notasDaTurma[i][j];
				
			}
		}
		double media = soma /(qtdAluno*qtdNotas );
		System.out.println("A media da turma foi " + media);
		
		
		
		
		
		
		
		in.close();
	}

}
