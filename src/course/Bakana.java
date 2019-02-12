package course;

import java.util.Scanner;

public class Bakana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matriz: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		int toFind = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] == toFind) {
					System.out.println("Position: " + (i+1) + ", " + (j+1));
					if (j-1 > 0) {
						System.out.println("Left: " + (matriz[i][j-1]));
					}
					
					if (j+1 < m) {
						System.out.println("Right: " + (matriz[i][j+1]));
					}
					
					if (i+1 < n) {
						System.out.println("Down: " + (matriz[i+1][j]));
					}
				}
			}
		}
	}

}
