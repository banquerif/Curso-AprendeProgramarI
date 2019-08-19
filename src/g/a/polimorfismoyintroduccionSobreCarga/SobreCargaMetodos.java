package g.a.polimorfismoyintroduccionSobreCarga;

public class SobreCargaMetodos {
	
	private int n1;
	private double n2;
	
	//GETTTERS AND SETTERS
	public int getN1() {
		return n1;
	}
	public double getN2() {
		return n2;
	}
	
	//SOBRECARGA DE METODOS (METODOS CON EL MISMO NOMBRE | PERO CON DISTINTOS PARAMETROS)
	public void setN(int n1) {
		this.n1 = n1;
	}
	public void setN(double n2) {
		this.n2 = n2;
	}
	public void setN(int n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public void setN(double n2, int n1) {
		this.n2 = n2;
		this.n1 = n1;
	}
}