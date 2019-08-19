//CREAR UN LIBRO MEDIANTE OBJETOS CON ATRIBUTOS PUBLICO | SIN EL USO DE CONSTRUCTORES

package e.a.orientadoObjetos;

public class ObjetoPublicoLibroPrincipal {

	public static void main(String[] args) {
		
		ObjetoPublicoLibro lib1 = new ObjetoPublicoLibro();
		ObjetoPublicoLibro lib2 = new ObjetoPublicoLibro();
		
		//ATRIBUTOS PUBLICOS
		lib1.ISBN = 123;
		lib1.titulo = "Libro1";
		lib1.autor = "Autor1";
		
		//ATRIBUTOS PUBLICOS
		lib2.ISBN = 321;
		lib2.titulo = "Libro2";
		lib2.autor = "Autor2";
		
		System.out.println("Titulo - "+lib1.titulo+" | Autor - "+lib1.autor+" | ISBN - "+lib1.ISBN);
		System.out.println("Titulo - "+lib2.titulo+" | Autor - "+lib2.autor+" | ISBN - "+lib2.ISBN);
		
	}
}