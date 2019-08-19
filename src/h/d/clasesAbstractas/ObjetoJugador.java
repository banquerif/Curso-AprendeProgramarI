package h.d.clasesAbstractas;

public abstract class ObjetoJugador {
	
	private int salud, ataque;
	
	public ObjetoJugador() {
		//CONSTRUCTOR VACIO
	}
	public ObjetoJugador(int salud, int ataque) {
		
		this.salud = salud;
		this.ataque = ataque;
		
	}
	
	//GETTERS
	public int getSalud() {
		return salud;
	}
	public int getAtaque() {
		return ataque;
	}
}