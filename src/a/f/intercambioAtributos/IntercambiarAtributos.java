package a.f.intercambioAtributos;

import java.util.Scanner;

public class IntercambiarAtributos {

	public static void main(String[] args) {
		
		int n1,n2,aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor de (n1): ");
		n1 = sc.nextInt();
		System.out.print("Introduce el valor de (n2): ");
		n2 = sc.nextInt();
		sc.close();
		
		aux = n1;
		n1 = n2;
		n2 = aux;
		
		System.out.println("El valor de (n1) es: "+n1);
		System.out.println("El valor de (n2) es: "+n2);
	}

}