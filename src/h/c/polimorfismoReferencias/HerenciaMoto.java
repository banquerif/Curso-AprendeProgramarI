package h.c.polimorfismoReferencias;

public class HerenciaMoto extends HerenciaVehiculo{

	private boolean cadena_rota;
	
	public HerenciaMoto(String nombre, int velocidad, int potencia, boolean cadena_rota) {
		super(nombre, velocidad, potencia);
		this.cadena_rota = cadena_rota;
	}

	//GETTERS AND SETTERS
	public boolean isCadena_rota() {
		return cadena_rota;
	}
	public void setCadena_rota(boolean cadena_rota) {
		this.cadena_rota = cadena_rota;
	}	
}