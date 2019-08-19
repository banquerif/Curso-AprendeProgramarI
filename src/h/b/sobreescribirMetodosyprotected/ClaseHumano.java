package h.b.sobreescribirMetodosyprotected;

import java.util.Random;

public class ClaseHumano {

	protected String nombre;
	protected int potencia, fuerza, defensa;
	
	private int ataque;
	
	Random rand = new Random(System.nanoTime());
	
	public ClaseHumano(String nombre, int potencia, int fuerza, int defensa) {
		
		this.nombre = nombre;
		this.potencia = potencia;
		this.fuerza = fuerza;
		this.defensa = defensa;
		
	}

	//GETTERS ANDS SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	//METODOS
	public int atacar() {
		ataque = rand.nextInt(5) * potencia * fuerza;
		return ataque;
	}
	public void respuesta(int num) {
		num = ataque;
		
		if(num < 50) {
			System.out.println("Has perdido - Clase Humano");
		} else {
			System.out.println("Has ganado - Clase Humano");
		}
	}
}