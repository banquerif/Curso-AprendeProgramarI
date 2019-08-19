package c.d.depurarNumerosPrimos;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		int numero;
		boolean primo = true;
		
		Scanner sc = new Scanner(System.in);

		//PRIMO - NUMERO DIVISIBLE ENTRE EL MISMO Y 1
		System.out.print("Introduce un numero (PRIMO): ");
		numero = sc.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		if(primo) {
			System.out.println("El numero "+numero+" es (PRIMO)");
		}else {
			System.out.println("El numero "+numero+" no es (PRIMO)");
		}
		sc.close();
	}
}