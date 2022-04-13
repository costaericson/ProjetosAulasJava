package Entidadeds;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco =preco;
		this.quantidade = quantidade;
		
	}
	public String setName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	
	
	
	public double ValorTotalemEstoque() {
		return preco * quantidade;
	}
	public void AddProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void RemoveProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome;
		
	}
}
