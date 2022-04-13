package Collections;

import java.util.HashSet;

public class ClassSet {
	
	public static void main(String[] args) {
		HashSet produto = new HashSet();
		
		produto.add(1.5);
		produto.add("maria");
		produto.add(false);
		produto.add('y');
		
		System.out.println(produto.size());
		System.out.println(produto);
	}

}
