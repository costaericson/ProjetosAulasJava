package Data;



public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data (01, 12, 1993);
		
		
		System.out.printf("A data de nascimento é: %"
				+ "d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.println(d1.obterDataFormatado());
		
		d1.impriimirDataFormatada();
		d2.impriimirDataFormatada();
		
		
		
		}
	}


