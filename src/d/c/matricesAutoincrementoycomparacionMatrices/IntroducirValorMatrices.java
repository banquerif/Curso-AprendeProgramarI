//MATRICES

package d.c.matricesAutoincrementoycomparacionMatrices;

import java.util.Scanner;

public class IntroducirValorMatrices {

	public static void main(String[] args) {
		
		int f,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor numerico (f): ");
		f = sc.nextInt();
		
		System.out.print("Introduce el valor numerico (c): ");
		c = sc.nextInt();
		
		int[][] mat = new int[f][c];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				
				System.out.print("Introduce el valor numerico, matriz["+i+"]"+"["+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		sc.close();
		
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
		}
	}
}