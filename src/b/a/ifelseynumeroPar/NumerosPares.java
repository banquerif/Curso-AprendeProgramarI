package b.a.ifelseynumeroPar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPares {

	// NUMERO PAR | IMPAR
	public static void main(String[] args) {

// PAR / IMPAR

//		int n1 = 7, aux = 2,condicion;
//		
//		condicion = n1 % aux;
//
//		if(condicion == 0)
//			System.out.println("El numero "+n1+" es PAR");
//		else
//			System.out.println("El numero "+n1+" es IMPAR");

		int n1, condicion, contador = 0;

		Scanner sc = new Scanner(System.in);

		do {
			
			try {
				System.out.print("Introduce un numero (PAR) o (IMPAR): ");
				n1 = sc.nextInt();
				condicion = n1 % 2;
				
				if(condicion == 0) {
					System.out.println("El numero "+n1+" es PAR");
					contador++;
				}else {
					System.out.println("El numero "+n1+" es IMPAR");
					contador++;
				}
			}catch(InputMismatchException e) {
				System.out.println("Error: No se ha introducido un valor (numerico)");
				break;
			}
			
			
		} while (contador < 10);
		sc.close();
	}

}