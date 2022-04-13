package Data;



public class Data {
	int dia ;
	int mes ;
	int ano ;
	
	
	Data (int diaNovo, int mesNovo, int anoNovo){
		dia = diaNovo;
		mes = mesNovo;
		ano = anoNovo;
	}
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	String obterDataFormatado() {
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}
	void impriimirDataFormatada() {
		System.out.println(obterDataFormatado());
	}

}
