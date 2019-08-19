package f.b.staticAtributosymetodos;

public class ObjetoEstaticoTriangulo {
	
	private int area;
	private static String nombre;
	
	public ObjetoEstaticoTriangulo(int area, String nombre) {
		this.area = area;
		ObjetoEstaticoTriangulo.nombre = nombre; //EJEMPLO ATRIBUTO STATIC
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		ObjetoEstaticoTriangulo.nombre = nombre;
	}
}