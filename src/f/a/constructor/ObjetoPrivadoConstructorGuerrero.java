package f.a.constructor;

import java.util.Random;

public class ObjetoPrivadoConstructorGuerrero {

	private String nombre;
	private int ataque, salud;
	private int fuerza, golpe_total;
	
	public ObjetoPrivadoConstructorGuerrero() {
		//CONSTRUCTOR VACIO
	}
	
	public ObjetoPrivadoConstructorGuerrero(String nombre, int ataque, int salud) {
		
		this.nombre = nombre;
		this.ataque = ataque;
		this.salud = salud;
		
	}
	
	//GETTERS AND SETTERS
	
	Random rand = new Random(System.nanoTime());
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	public int getGolpe_Total() {
		return golpe_total;
	}
	public void setGolpe_Total(int golpe_total) {
		this.golpe_total = golpe_total;
	}
	
	//METODOS
	public int ataque() {
		
		fuerza = rand.nextInt(5);
		golpe_total = fuerza * ataque;
		return golpe_total;
		
	}
	
}