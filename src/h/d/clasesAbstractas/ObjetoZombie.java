package h.d.clasesAbstractas;

public class ObjetoZombie extends ObjetoJugador{

	int mordisco;
	
	public ObjetoZombie() {
		//CONSTRUCTOR VACIO
	}
	public ObjetoZombie(int salud, int ataque, int mordisco) {
		
		super(salud, ataque);
		this.mordisco = mordisco;
		
	}
	
	//GETTERS
	public int getMordisco() {
		return mordisco;
	}
}