package Entidadeds;

public class ContaBancaria {
	private int conta;
	private String nome;
	private double saldo;
	
	
	
	
	
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int conta, String nome) {
	
		this.conta = conta;
		this.nome = nome;
	}
	public ContaBancaria(int conta, String nome, double saldo) {
	
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Deposito(double valor) {
			 saldo +=valor; 
	}
	
	public void Saque(double valor) {
		saldo -= (valor+5);
	}
	
	
	public String toString() {
		"Bom dia senhor(a)" + getNome + ", o seu saldo é de "+getsaldo;
		
	}
	
	
	
	
	

}
