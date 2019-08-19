package d.a.vectorI;

import java.util.Scanner;

public class EscribirLeerVectorII {

	public static void main(String[] args) {
		
		int[] vec = new int[5];
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < vec.length; i++) {
			
			System.out.print("Introduce valor al vector "+i+": ");
			vec[i] = sc.nextInt();
			
		}
		
		System.out.println();
		
		for(int j = 0; j < vec.length; j++) {
			
			System.out.println("El valor del vector "+j+" es ("+vec[j]+")");
			
		}
		sc.close();
	}
}