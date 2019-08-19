package h.b.sobreescribirMetodosyprotected;

import java.util.Random;

public class ClaseGuerrero extends ClaseHumano {

	protected int armadura;
	
	private int ataque;
	
	Random rand = new Random(System.nanoTime());

	public ClaseGuerrero(String nombre, int potencia, int fuerza, int defensa, int armadura) {
		super(nombre, potencia, fuerza, defensa);
		this.armadura = armadura;
	}

	// GETTERS AND SETTERS
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	// METODOS
	public int atacar() {
		ataque = rand.nextInt(5) * potencia * fuerza;
		return ataque;
	}

	public void respuesta(int num) {
		num = ataque;

		if (num < 50) {
			System.out.println("Has perdido - Clase Guerrero");
		} else {
			System.out.println("Has ganado - Clase Guerrero");
		}
	}
}