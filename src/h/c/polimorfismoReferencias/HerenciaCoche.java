package h.c.polimorfismoReferencias;

public class HerenciaCoche extends HerenciaVehiculo{

	private int numero_puertas;
	
	public HerenciaCoche(String nombre, int velocidad, int potencia, int numero_puertas) {
		super(nombre, velocidad, potencia);
		this.numero_puertas = numero_puertas;
	}

	//GETTERS AND SETTERS
	public int getNumero_puertas() {
		return numero_puertas;
	}
	public void setNumero_puertas(int numero_puertas) {
		this.numero_puertas = numero_puertas;
	}
}