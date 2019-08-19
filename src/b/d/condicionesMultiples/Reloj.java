package b.d.condicionesMultiples;

import java.util.Scanner;

public class Reloj {

	public static void main(String[] args) {

		int hora, minutos, segundos;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Introduce la hora: ");
			hora = sc.nextInt();

			System.out.print("Introduce los minutos: ");
			minutos = sc.nextInt();

			System.out.print("Introduce los segundos: ");
			segundos = sc.nextInt();

			if (hora < 0 || hora >= 25 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60) {
				System.out.println();
				System.out.println("La hora introducida es (INCORRECTA), vuelve a intentarlo");
				System.out.println();
			} else {
				System.out.println();
				System.out.println("La hora introducida es (CORRECTA)");
				System.out.println();
			}

		} while (hora < 0 || hora >= 25 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60);

		if (segundos == 59) {
			segundos = 0;
			minutos++;
		} else {
			segundos++;
		}
		if (minutos >= 59) {
			minutos = 0;
			hora++;
		}
		if (hora == 24) {
			hora = 0;
		}
		
		sc.close();
		System.out.println(hora + ":" + minutos + ":" + segundos);

	}
}