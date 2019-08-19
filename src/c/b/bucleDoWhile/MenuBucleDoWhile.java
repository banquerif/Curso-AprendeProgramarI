package c.b.bucleDoWhile;

import java.util.Scanner;

public class MenuBucleDoWhile {

	public static void main(String[] args) {
		
		int numero_menu;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Menu 1 - Hola");
			System.out.println("Menu 2 - Bien");
			System.out.println("Menu 3 - Hasta Pronto");
			System.out.println();
			
			System.out.print("Introduce un numero de la lista: ");
			numero_menu = sc.nextInt();
			
		} while(numero_menu <= 0 || numero_menu > 3);
		
		switch(numero_menu) {
			case 1:
				System.out.println("Hola");
				break;
			case 2:
				System.out.println("Bien");
				break;
			case 3:
				System.out.println("Hasta Pronto");
				break;
		}
		sc.close();
	}

}