package util;

public class CurrencyConverter {
	
	public static double convertToRealWithTaxes(double dollar_price, double reais ) {
		double var =  0.06 * reais * dollar_price;
		System.out.println(var);
		return (dollar_price * reais + var);
	}
}
