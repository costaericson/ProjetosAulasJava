package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Caneta";
		p1.preco = 10.5;
		p1.desconto = 0.5;
		
		Produto p2 = new Produto();
		p2.nome = "Caderno";
		p2.preco = 8.25;
		p2.desconto = 0.25;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFInal1 = p1.preco *(1-p1.desconto);
		double precoFinal2 = p2.preco *(1-p2.desconto);
		
		System.out.println((precoFInal1 + precoFinal2)/2);
		
		
	}


}
