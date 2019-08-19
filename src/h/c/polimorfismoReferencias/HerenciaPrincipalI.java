package h.c.polimorfismoReferencias;

import java.util.Scanner;

public class HerenciaPrincipalI {

	public static void main(String[] args) {

		// COCHE = |NOMBRE, VELOCIDAD, POTENCIA, NUMERO PUERTAS
		// MOTO = |NOMBRE, VELOCIDAD, POTENCIA, CADENA ROTA

		int num;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1 - Crea un coche");
			System.out.println("2 - Crea una moto");
			System.out.print("Introduce un valor (numerico): ");
			num = sc.nextInt();

		} while (num <= 0 || num >= 3);
		
		HerenciaVehiculo coche = null;
		HerenciaVehiculo moto = null;

		switch (num) {
		case 1:
			coche = new HerenciaCoche("Coche", 0, 30, 5);
		case 2:
			moto = new HerenciaMoto("Moto", 0, 60, false);
		}
		sc.close();

		if (num == 1) {

			System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

			coche.acelerar();

			System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

			coche.frenar();

			System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		} else {

			System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());
			
			moto.acelerar();

			System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());
			
			moto.frenar();

			System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());
			
		}
	}
}