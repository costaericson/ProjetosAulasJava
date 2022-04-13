package oo.composicao;

import java.util.ArrayList;

import Collections.Lista;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	String cliente;
	
	double pegaValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	

}
