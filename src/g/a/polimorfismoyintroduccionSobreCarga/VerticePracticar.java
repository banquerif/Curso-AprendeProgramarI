package g.a.polimorfismoyintroduccionSobreCarga;

public class VerticePracticar {
	
	private int x,y;
	
	//CONSTRUCTOR
	public VerticePracticar(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//CONSTRUCTOR DE COPIA
	public VerticePracticar(VerticePracticar copia) {
		//NO OBTIMO
		x = copia.x;
		y = copia.y;
	}

	//GET AND SET
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}