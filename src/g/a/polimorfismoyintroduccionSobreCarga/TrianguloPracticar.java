//CONSTRUCTORES - SE CREAN, PERO NO SE VAN CREAR, INICIALIZAR O RESERVAR MEMORIA


package g.a.polimorfismoyintroduccionSobreCarga;

public class TrianguloPracticar {
	
	// PRIVATE VERTICE A = NEW VERTICE(); - CREAR OBJETO SIN (INICIALIZARLO, CREARLO, RESERVAR MEMORIA)
	private VerticePracticar a, b, c;
	
	public TrianguloPracticar(VerticePracticar a, VerticePracticar b, VerticePracticar c) {
		this.a = new VerticePracticar(a);
		this.b = new VerticePracticar(b);
		this.c = new VerticePracticar(c);
	}

	//SET AND GET
	public VerticePracticar getA() {
		//FORMA LARGA
		//VERTICEPRACTICAR COPIA = NEW VERTICEPRATICAR(A);
		return new VerticePracticar(a);
	}
	public void setA(VerticePracticar a) {
		this.a = a;
	}
	public VerticePracticar getB() {
		return b;
	}
	
	public void setB(VerticePracticar b) {
		this.b = b;
	}

	public VerticePracticar getC() {
		return c;
	}

	public void setC(VerticePracticar c) {
		this.c = c;
	}
	
	

}