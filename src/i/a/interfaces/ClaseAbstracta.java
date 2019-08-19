//SI ES UN CLASE
//SI PUEDEN CONTENER ATRIBUTOS
//SI SE PUEDEN IMPLEMENTAR LOS METODOS | PUEDEN CONTENER METODOS ABSTRACTOS
//SI TIENEN CONSTRUCTORES
//DE LAS CLASES ABSTRACTAS SE HEREDA

package i.a.interfaces;

public abstract class ClaseAbstracta {
	
	int a = 1, b = 1;
	
	//CONSTRUCTOR
	public ClaseAbstracta() {
		//CONSTRUCTOR VACIO
	}
	public ClaseAbstracta(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int devolverA();
	public abstract int devolverB();
	
}