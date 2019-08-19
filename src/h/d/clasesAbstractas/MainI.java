package h.d.clasesAbstractas;

import java.util.Random;
import java.util.Scanner;

public class MainI {
	public static void main(String[] args) {

		String nombre_guerrero, nombre_zombie;
		int salud_guerrero, ataque_guerrero, armadura;
		int salud_zombie, ataque_zombie, mordisco;
		int aleatorio, menu_guerrero, menu_zombie;
		boolean fin_juego = false;

		// 1. PEDIR EL NOMBRE DEL GUERRERO/ZOMBIE (DE FORMA ALEATORIA)
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(System.nanoTime());

		aleatorio = rand.nextInt(2);

		System.out.println("EL JUEGO A COMENZADO 🎲");
		System.out.println();

		salud_guerrero = rand.nextInt(100) + 50;
		salud_zombie = rand.nextInt(100) + 50;

		if (aleatorio == 0) {
			System.out.print("Introduce tu nombre ⚔️ (Guerrero): ");
			nombre_guerrero = sc.nextLine();
			System.out.print("Introduce tu nombre 🧟 (Caminante): ");
			nombre_zombie = sc.nextLine();

			System.out.println();
			System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
			System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
			System.out.println();
		} else {
			System.out.print("Introduce tu nombre 🧟 (Caminante): ");
			nombre_zombie = sc.nextLine();
			System.out.print("Introduce tu nombre ⚔️ (Guerrero): ");
			nombre_guerrero = sc.nextLine();

			System.out.println();
			System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
			System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
			System.out.println();
		}

		// 2. MENU DE LUCHA
		do {
			if (aleatorio == 0) {
				// PRIMER BLOQUE = 0

				// GUERRERO
				if (salud_guerrero > 0 && salud_zombie > 0) {
					
					System.out.println("1. Opcion - Atacar");
					System.out.println("2. Opcion - Utilizar (Armadura)");
					System.out.print("Elige una opcion ⚔️ (Guerrero): ");
					menu_guerrero = sc.nextInt();

					ataque_guerrero = rand.nextInt(10) + 1;
					ataque_zombie = rand.nextInt(10) + 1;

					switch (menu_guerrero) {
					case 1:
						salud_zombie -= ataque_guerrero;

						if (salud_zombie < 0) {
							salud_zombie = 0;
							System.out.println();
							System.out.println("Guerrero1 - " + nombre_guerrero + " (daño (" + ataque_guerrero + "))"
									+ " 🗡️ Zombie - " + nombre_zombie + " (salud (" + salud_zombie + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 1");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Guerrero1 - " + nombre_guerrero + " (daño (" + ataque_guerrero + "))"
									+ " 🗡️ Zombie - " + nombre_zombie + " (salud (" + salud_zombie + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					case 2:
						armadura = rand.nextInt(20) + 1;

						if (salud_guerrero > 0) {
							salud_guerrero += armadura;
							System.out.println();
							System.out.println("Guerrero2 - " + nombre_guerrero + " (ha aumentado su salud ("
									+ (salud_guerrero - armadura) + ") + (" + armadura + ") = " + salud_guerrero);
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						} else {
							System.out.println("No se puede continuar el guerrero tiene 0 puntos de vida ...");
							
							System.out.println("Entra fin juego 2");
							fin_juego = true;
							break;
						}
					}
				} else {
					
					System.out.println("Entra fin juego 3");
					fin_juego = true;
					break;
				}

				// ZOMBIE
				if (salud_guerrero > 0 && salud_zombie > 0) {

					System.out.println("1. Opcion - Atacar");
					System.out.println("2. Opcion - Utilizar (Mordisco)");
					System.out.print("Elige una opcion 🧟 (Caminante): ");
					menu_zombie = sc.nextInt();

					ataque_guerrero = rand.nextInt(10) + 1;
					ataque_zombie = rand.nextInt(10) + 1;

					switch (menu_zombie) {
					case 1:
						salud_guerrero -= ataque_zombie;

						if (salud_guerrero < 0) {
							salud_guerrero = 0;
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 4");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					case 2:
						mordisco = rand.nextInt(20) + 1;
						salud_guerrero -= ataque_zombie + mordisco;

						if (salud_guerrero < 0) {
							salud_guerrero = 0;
							System.out.println();
							System.out.println("Zombie2 - " + nombre_zombie + " (daño (" + ataque_zombie + ") + ("
									+ mordisco + ")" + " 🧟‍♀️️ Guerrero - " + nombre_guerrero + " (salud ("
									+ salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 5");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Zombie2 - " + nombre_zombie + " (daño (" + ataque_zombie + ") + ("
									+ mordisco + ")" + " 🧟‍♀️️ Guerrero - " + nombre_guerrero + " (salud ("
									+ salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					}
				} else {
					
					System.out.println("Entra fin juego 6");
					fin_juego = true;
					break;
				}
			} else {

				// SEGUNDO BLOQUE = 1

				// ZOMBIE
				if (salud_guerrero > 0 && salud_zombie > 0) {

					System.out.println("1. Opcion - Atacar");
					System.out.println("2. Opcion - Utilizar (Mordisco)");
					System.out.print("Elige una opcion 🧟 (Caminante): ");
					menu_zombie = sc.nextInt();

					ataque_guerrero = rand.nextInt(10) + 1;
					ataque_zombie = rand.nextInt(10) + 1;

					switch (menu_zombie) {
					case 1:
						salud_guerrero -= ataque_zombie;

						if (salud_guerrero < 0) {
							salud_guerrero = 0;
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 7");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					case 2:
						mordisco = rand.nextInt(20) + 1;
						salud_guerrero -= ataque_zombie + mordisco;

						if (salud_guerrero < 0) {
							salud_guerrero = 0;
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 8");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Zombie1 - " + nombre_zombie + " (daño (" + ataque_zombie + "))"
									+ " 🧟‍♀️ Guerrero - " + nombre_guerrero + " (salud (" + salud_guerrero + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					}
				} else {
					
					System.out.println("Entra fin juego 9");
					fin_juego = true;
					break;
				}

				// GUERRERO
				if (salud_guerrero > 0 && salud_zombie > 0) {

					System.out.println("1. Opcion - Atacar");
					System.out.println("2. Opcion - Utilizar (Armadura)");
					System.out.print("Elige una opcion ⚔️ (Guerrero): ");
					menu_guerrero = sc.nextInt();

					ataque_guerrero = rand.nextInt(10) + 1;
					ataque_zombie = rand.nextInt(10) + 1;

					switch (menu_guerrero) {
					case 1:
						salud_zombie -= ataque_guerrero;

						if (salud_zombie < 0) {
							salud_zombie = 0;
							System.out.println();
							System.out.println("Guerrero1 - " + nombre_guerrero + " (daño (" + ataque_guerrero + "))"
									+ " 🗡️ Zombie - " + nombre_zombie + " (salud (" + salud_zombie + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							
							System.out.println("Entra fin juego 10");
							fin_juego = true;
							break;
						} else {
							System.out.println();
							System.out.println("Guerrero1 - " + nombre_guerrero + " (daño (" + ataque_guerrero + "))"
									+ " 🗡️ Zombie - " + nombre_zombie + " (salud (" + salud_zombie + "))");
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						}
					case 2:
						armadura = rand.nextInt(20) + 1;
						salud_guerrero += armadura;

						if (salud_guerrero > 0) {
							System.out.println();
							System.out.println("Guerrero2 - " + nombre_guerrero + " (ha aumentado su salud ("
									+ (salud_guerrero - armadura) + ") + (" + armadura + ") = " + salud_guerrero);
							System.out.println();
							System.out.println("Salud Guerrero " + nombre_guerrero + " +(" + salud_guerrero + ")");
							System.out.println("Salud Zombie " + nombre_zombie + " +(" + salud_zombie + ")");
							System.out.println();
							break;
						} else {
							System.out.println("No se puede continuar el guerrero tiene 0 puntos de vida ...");
							
							System.out.println("Entra fin juego 11");
							fin_juego = true;
							break;
						}
					}
				} else {
					System.out.println("Entra fin juego 12");
					fin_juego = true;
					break;
				}
			}
		} while (salud_guerrero >= 0 && salud_zombie >= 0 && fin_juego == false);

		System.out.println("Fuera del bucle");
		if(salud_guerrero == 0) {
			System.out.println("Zombie - "+nombre_zombie+" ha (GANADO) 🏅");
		}
		if(salud_zombie == 0) {
			System.out.println("Guerrero - "+nombre_guerrero+" ha (GANADO) 🏅");
		}

		sc.close();
	}
}