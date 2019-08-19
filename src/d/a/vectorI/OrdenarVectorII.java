//ORDENAR UN VECTOR DE MENOR A MAYOR MEDIANTE EL METODO DE LA BURBUJA

package d.a.vectorI;

public class OrdenarVectorII {

	public static void main(String[] args) {

//		aux = a
//		a = b
//		b = aux

//		aux = j1+1
//		j+1 = j
//		j = aux

		int[] vec_mayorMenor = { 5, 4, 3, 2, 1 };

		int aux;

		for (int i = 0; i < vec_mayorMenor.length; i++) {
			System.out.print(vec_mayorMenor[i] + " ");

		}

		System.out.println();

		// ORDENAMIENTO | METODO BURBUJA - MAYOR A MENOR
		for (int i = 0; i < vec_mayorMenor.length - 1; i++) {
			for (int j = 0; j < vec_mayorMenor.length - i - 1; j++) {

				if (vec_mayorMenor[j + 1] < vec_mayorMenor[j]) {

					System.out.println();
					System.out.println("vec[j+1]" + vec_mayorMenor[j + 1]);
					System.out.println("vec[j]" + vec_mayorMenor[j]);

					aux = vec_mayorMenor[j + 1];
					vec_mayorMenor[j + 1] = vec_mayorMenor[j];
					vec_mayorMenor[j] = aux;

					System.out.println("vec[j+1]" + vec_mayorMenor[j + 1]);
					System.out.println("vec[j]" + vec_mayorMenor[j]);
					System.out.println();

					for (int x = 0; x < vec_mayorMenor.length; x++) {
						System.out.print(vec_mayorMenor[x] + " ");
					}
				}
			}
		}
		
		System.out.println();

		int[] vec_menorMayor = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < vec_menorMayor.length; i++) {
			System.out.print(vec_menorMayor[i] + " ");
		}

		// ORDENAMIENTO | METODO BURBUJA - MENOR A MAYOR
		for (int d = 0; d < vec_menorMayor.length - 1; d++) {
			for (int z = 0; z < vec_menorMayor.length - d - 1; z++) {

				if (vec_menorMayor[z + 1] > vec_menorMayor[z]) {

					System.out.println();
					System.out.println("vec[z+1]" + vec_menorMayor[z + 1]);
					System.out.println("vec[z]" + vec_menorMayor[z]);

					aux = vec_menorMayor[z + 1];
					vec_menorMayor[z + 1] = vec_menorMayor[z];
					vec_menorMayor[z] = aux;

					System.out.println("vec[z+1]" + vec_menorMayor[z + 1]);
					System.out.println("vec[z]" + vec_menorMayor[z]);
					System.out.println();

					for (int s = 0; s < vec_menorMayor.length; s++) {
						System.out.print(vec_menorMayor[s] + " ");
					}
				}
			}
		}
	}
}