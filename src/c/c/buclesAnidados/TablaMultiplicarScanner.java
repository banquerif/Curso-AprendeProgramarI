package c.c.buclesAnidados;

import java.util.Scanner;

public class TablaMultiplicarScanner {

	public static void main(String[] args) {

		// TABLA DE MULTIPLICAR 1 - 10
		int numero_scanner, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero, para mostrar su tabla de multiplicar: ");
		numero_scanner = sc.nextInt();

		for (int i = numero_scanner; i < numero_scanner+1; i++) {

			System.out.println();
			System.out.println("Tabla del " + i);
			System.out.println();

			for (int j = 0; j <= 10; j++) {
				resultado = i * j;
				System.out.println(i + " * " + j + " = " + resultado);

			}
			sc.close();
		}
	}
}