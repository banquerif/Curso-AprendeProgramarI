//MOSTRAR TODOS LOS NUMEROS QUE HAY ENTRE DOS NUMEROS INTRODUCIDOS POR TECLADO

package c.a.buclesWhileyfor;

import java.util.Scanner;

public class SumarMostrarBucleForyWhile {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4,aux; //n1 = 1 n2 = 5 | 2,3,4
		boolean boolean_imprimir = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el 1º numero: ");
		n1 = sc.nextInt();
		
		System.out.print("Introduce el 2º numero: ");
		n2 = sc.nextInt();
		sc.close();
		
		n3 = n1;
		n4 = n2;
		
		while(n1 < n2) {
			
			if(boolean_imprimir) {
				System.out.print(n1+" ");
				n1++;
			}else {
				n1++;
				boolean_imprimir = true;
			}
		}
		
		System.out.println();
		boolean_imprimir = false;
		for(aux = n3; aux < n4; aux++) {
			
			if(boolean_imprimir) {
				System.out.print(aux+" ");
			}else {
				boolean_imprimir = true;
			}
			
		}
	}
}