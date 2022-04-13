package Entidadeds;

public class Salario {
	public String nome;
	public double salario;
	public double taxa;
	
	
	public void AumentoSalario(double porcentagem) {
		salario +=((porcentagem/100)*salario);
	}
	public double SalarioLiquido() {
		salario = salario - taxa;
		return salario;
	}
	
	public String toString() {
		return nome+", "+"R$: "+ salario;
	}
}
