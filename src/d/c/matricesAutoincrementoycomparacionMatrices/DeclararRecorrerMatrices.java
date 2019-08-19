package d.c.matricesAutoincrementoycomparacionMatrices;

import java.util.Scanner;

public class DeclararRecorrerMatrices {

	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el valor numerico (f): ");// FILAS
		a = sc.nextInt();

		System.out.print("Introduce el valor numerico (c): ");// COLUMNAS
		b = sc.nextInt();
		sc.close();

		// DECLARAR MATRIZ
		int[][] mat = new int[a][b];
		
		//mat[0][0]
		//mat[1][1]
		//mat[2][2]
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat.length; j++) {
				
				System.out.print(mat[i][j]);
				
			}
		}
	}
}