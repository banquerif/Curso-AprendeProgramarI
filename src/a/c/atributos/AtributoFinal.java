package a.c.atributos;

public class AtributoFinal {

	private final int ISBN = 957;

	
	public int getISBN() {
		return ISBN;
	}
	
/* Al utilizar la palabra (FINAL) no se puede hacer uso del metodo
   SET (no permitiendo asignar nuevos valores a los atributos del objeto)*/
	
//	public void setISBN(int iSBN) {
//		ISBN = iSBN;
//	}

}