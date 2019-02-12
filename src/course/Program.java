package course;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price ? ");
		double a = sc.nextDouble();
		System.out.println("How many dollars will be bought ? ");
		double b = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.convertToRealWithTaxes(a,b));
	}
}
