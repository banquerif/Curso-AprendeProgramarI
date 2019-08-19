package h.d.clasesAbstractas;

public class ObjetoGuerrero extends ObjetoJugador{

	int armadura;
	
	public ObjetoGuerrero() {
		//CONSTRUCTOR VACIO
	}
	public ObjetoGuerrero(int salud, int ataque, int armadura) {
		
		super(salud, ataque);
		this.armadura = armadura;
		
	}
	public int getArmadura() {
		return armadura;
	}
}