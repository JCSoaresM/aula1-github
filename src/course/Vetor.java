package course;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product[] vect = new Product [n];
		for (int i = 0; i < n; i++) {
			String name;
			double price;
			System.out.println("Enter product name: ");
			name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter product price: ");
			price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double aux = 0;
		for (int i = 0; i < vect.length; i++) {
			aux += vect[i].getPrice();
			System.out.println(vect[i].getName());
		}
		
		System.out.println("AVERAGE HEIGHT: " + aux/n );
	}
}
