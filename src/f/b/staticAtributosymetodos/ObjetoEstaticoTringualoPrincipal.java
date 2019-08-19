package f.b.staticAtributosymetodos;

public class ObjetoEstaticoTringualoPrincipal {

	public static void main(String[] args) {
	
		ObjetoEstaticoTriangulo t1 = new ObjetoEstaticoTriangulo(10, "T1");
		ObjetoEstaticoTriangulo t2 = new ObjetoEstaticoTriangulo(20, "T2");
		ObjetoEstaticoTriangulo t3 = new ObjetoEstaticoTriangulo(20, "T3");
		
		System.out.println("El valor del triangulo t1 es: "+t1.getArea()+ " el nombre es "+ObjetoEstaticoTriangulo.getNombre());
		System.out.println("El valor del triangulo t2 es: "+t2.getArea()+ " el nombre es "+ObjetoEstaticoTriangulo.getNombre());
		System.out.println("El valor del triangulo t3 es: "+t3.getArea()+ " el nombre es "+ObjetoEstaticoTriangulo.getNombre());
	}

}