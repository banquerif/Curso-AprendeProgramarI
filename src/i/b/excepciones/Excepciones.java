package i.b.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		
		int[] vec = new int[5];
		
		for(int i = 0; i < vec.length; i++) {
			
			vec[i] = i;
			System.out.print(vec[i]+" ");
			
		}
		
		System.out.println();
		
		try {
			vec[10] = 10;
		} catch (NullPointerException e) {
			System.out.println("La referencia no se ha inicializado");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se intenta acceder a un espacio de memoria no asignado");
		} catch (Exception e) {
			System.out.println("Error Desconocido");
		}
	}

}