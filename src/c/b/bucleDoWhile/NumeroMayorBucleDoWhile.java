package c.b.bucleDoWhile;

import java.util.Scanner;

public class NumeroMayorBucleDoWhile {

	public static void main(String[] args) {
		
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero menor: ");
		n1 = sc.nextInt();
		
		do {
			
			System.out.print("Introduce el numero mayor: ");
			n2 = sc.nextInt();
			
		}while(n1 >= n2);
			
		sc.close();
		System.out.println(n1+" es menor que "+n2);

	}

}