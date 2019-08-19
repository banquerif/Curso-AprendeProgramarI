//INSTRUCCIONES CONDICIONALES (IF/ELSE | SWITCH)

package b.c.charyswitch;

import java.util.Scanner;

public class InstruccionSwitch {

	public static void main(String[] args) {
		
		int n1,n2,sumar,restar,multiplicar,dividir;
		String operador;
		
		Scanner sc_numeros = new Scanner(System.in);
		
		Scanner sc_letras = new Scanner(System.in);
		
		System.out.print("Introduce el numero (n1): ");
		n1 = sc_numeros.nextInt();
		
		System.out.print("Introduce el numero (n2): ");
		n2 = sc_numeros.nextInt();
		
		System.out.print("Introduce el operador (+,-,*,/,%): ");
		operador = sc_letras.nextLine();
		
		sc_numeros.close();
		sc_letras.close();
		
//		System.out.println("N1: "+n1);
//		System.out.println("N2: "+n2);
//		System.out.println("Operador: "+operador);
		
		sumar = n1+n2;
		restar = n1-n2;
		multiplicar = n1*n2;
		dividir = n1/n2;
		
		switch (operador) {
		case "+":
			System.out.println("(N1) + (N2) = "+sumar);
			break;
		case "-":
			System.out.println("(N1) + (N2) = "+restar);
			break;
		case "*":
			System.out.println("(N1) + (N2) = "+multiplicar);
			break;
		case "/":
			System.out.println("(N1) + (N2) = "+dividir);
			break;
		default:
			System.out.println("No se ha introducido un (OPERADOR) correcto");
		}
	}

}