package Arrays;



public class Exercicio {
	public static void main(String[] args) {
	double [] notaAluno = new double[3];
	notaAluno[1] = 3.0;
	notaAluno[2] = 7;
	notaAluno[0] = 10;
	
	double teste = 0;
	double teste2 = 0;
	for(int i = 0; i<notaAluno.length; i++) {
		teste += notaAluno[i];
	}
	
	for(double n: notaAluno) {
		teste2 += n; 
		System.out.println(n);
		
	}
	teste = teste/notaAluno.length;
	teste2 = teste2/notaAluno.length;
	
	System.out.println(teste);
	System.out.println(teste2);
		
	
		
		
		
	}

}
