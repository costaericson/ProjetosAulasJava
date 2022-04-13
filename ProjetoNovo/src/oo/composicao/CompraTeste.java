package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		
		compra1.itens.add(new Item("lapis", 10, 0.95));
		compra1.itens.add(new Item("Caderno", 4, 12.55));
		compra1.itens.add(new Item("Caneta", 10, 2.5));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.pegaValorTotal());
		
		
		
		
		
		
	}
	

}
