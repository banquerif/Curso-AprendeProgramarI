package d.a.vectorI;

import java.util.Scanner;

public class CalcularMediaVector {

	public static void main(String[] args) {
		
		int size_vector;
		double suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del vector: ");
		size_vector = sc.nextInt();
		
		double[] vec = new double[size_vector];

		for(int i = 0; i < vec.length; i++) {
			System.out.print("Introduce un valor a vec "+i+": ");
			vec[i] = sc.nextDouble();
		}
		
		System.out.println("Valores Introducidos");
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
			suma += vec[i];
		}
		sc.close();
		
		System.out.println();
		System.out.println("La media de los numeros del vector es "+suma/size_vector);
		
	}
}