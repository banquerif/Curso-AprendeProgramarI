//COMPROBAR SI UN NUMERO DADO POR TECLADO ES PAR
// NUMERO PAR SI CUANDO SE DIVIDE ENTRE 2 SU RESTO DA 0

package b.a.ifelseynumeroPar;

import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		n = sc.nextInt();
		sc.close();
		
		i = n % 2;
		
		System.out.println("");
		if(i == 0) {
			System.out.println("El numero " +n+ " es PAR");
		}
		else {
			System.out.println("El numero "+n+ " es IMPAR");
		}
		
	}

}