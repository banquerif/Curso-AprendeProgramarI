package d.a.vectorI;

import java.util.Scanner;

public class EscribirLeerVectorI {
	
	public static void main(String[] args) {
		
		int i= 0, size_vector = 2;
		
		char[] vec = new char[size_vector];
		
		Scanner sc = new Scanner(System.in);
		
		while(i < size_vector) {
			System.out.print("Introduce el valor nº "+i+": ");
			vec[i] = sc.nextLine().charAt(0);
			i++;
		}
		
		if(vec[0] == vec[1]) {
			System.out.println();
			System.out.println("El valor 0 = ("+vec[0]+") y el valor 1 = ("+vec[1]+") son (IGUALES)");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("El valor 0 = ("+vec[0]+") y el valor 1 = ("+vec[1]+") no son (IGUALES)");
			System.out.println();
		}
		sc.close();
	}
}