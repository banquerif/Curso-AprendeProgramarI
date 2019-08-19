package c.b.bucleDoWhile;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		int num1, num2;
		boolean boolean_numero = false;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numero menor: ");
		num1 = sc.nextInt();

		// UN BUCLE DO WHILE SIEMPRE SE EJECUTA AL MENOS UNA VEZ
		do {

			System.out.print("Introduce el numero mayor: ");
			num2 = sc.nextInt();

		} while (num1 >= num2);

		while (num1 < num2) {

			if(boolean_numero) {
				System.out.print(num1+" ");
				num1++;
			} else {
				num1++;
				boolean_numero = true;
			}
		}
		sc.close();
	}
}