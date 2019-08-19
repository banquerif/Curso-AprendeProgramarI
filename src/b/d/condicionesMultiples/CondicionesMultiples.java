//CONDICIONES MULTIPLES

package b.d.condicionesMultiples;

import java.util.Scanner;

public class CondicionesMultiples {

	public static void main(String[] args) {
		
		// && = y - TODO TIENE QUE SER VERDADERO
		// || = O - UNA DE LAS CONDICIONES TIENE QUE SER VERDADERA
		
		int n1;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.print("Introduce un valor numerico: ");
			n1 = sc.nextInt();
			
			if(n1 > 0 && n1 < 5) {
				System.out.println("El numero esta entre 1 y 4 (&&)");
			}
			if(n1 > 0 || n1 < 10) {
				System.out.println("El numero es mayor que 0 o menor que 10 (||)");
			}
			
		}while(n1 > 0 && n1 < 10);
		
		sc.close();
	}
}