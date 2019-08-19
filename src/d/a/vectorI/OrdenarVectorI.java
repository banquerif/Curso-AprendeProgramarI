//ORDENAR UN VECTOR DE MENOR A MAYOR MEDIANTE EL METODO DE LA BURBUJA

// INT[] VEC = NEW INT[5];

//INT[] VEC = {1,2,3,4,5};

package d.a.vectorI;

public class OrdenarVectorI {

	public static void main(String[] args) {
		
		int[] vec = {5,4,3,2,1};
		int aux = 0;
		
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+ " |");
		}
		
		System.out.println("");
		
		for(int i = 0; i < vec.length; i++) {
			for(int j = i + 1; j < vec.length; j++) {
				if(vec[j] < vec[i]) {
					aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+ " |");
		}
		
	}

}