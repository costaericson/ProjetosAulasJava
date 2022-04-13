package Entidadeds;

public class Dolar {
	
	
	public static double IOF = 0.06;
	
	public static double ConverterDolar(double reais, double dolar) {
		
		return (dolar + (dolar*IOF))*reais;
		
	}

}
