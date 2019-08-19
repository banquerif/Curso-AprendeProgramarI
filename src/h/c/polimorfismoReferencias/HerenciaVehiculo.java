package h.c.polimorfismoReferencias;

public class HerenciaVehiculo {	
	
	private String nombre;
	private int velocidad, potencia;
	
	public HerenciaVehiculo(String nombre, int velocidad, int potencia) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.potencia = potencia;
	}

	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//METODOS
	public void acelerar() {
		velocidad = potencia * 2;
	}
	public void frenar() {
		velocidad = 0;
	}
}