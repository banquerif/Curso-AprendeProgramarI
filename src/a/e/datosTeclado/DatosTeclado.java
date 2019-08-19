package a.e.datosTeclado;

import java.util.Scanner;

public class DatosTeclado {

	public static void main(String[] args) {
		
		int n1,n2,sumar,restar,multiplicar,dividir,resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Introduce el segundo valor: ");
		n2 = sc.nextInt();
		sc.close();
		
		sumar = n1 + n2;
		restar = n1 - n2;
		multiplicar = n1 * n2;
		dividir = n1 / n2;
		resto = n1 % n2;
		
		//Operaciones con Atributos
		System.out.println(". Sumar: "+n1+" + "+n2+" = "+sumar);
		System.out.println(". Restar: "+n1+" - "+n2+" = "+restar);
		System.out.println(". Multiplicar: "+n1+" * "+n2+" = "+multiplicar);
		System.out.println(". Dividir: "+n1+" / "+n2+" = "+dividir);
		System.out.println(". Resto: "+n1+" % "+n2+" = "+resto);
	}

}