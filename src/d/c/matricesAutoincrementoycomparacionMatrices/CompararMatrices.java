package d.c.matricesAutoincrementoycomparacionMatrices;

public class CompararMatrices {

	public static void main(String[] args) {

		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		boolean iguales = true;

		if (mat1.length == mat2.length) {

			System.out.print("MATRICES = TAMAÑO | ");
			
			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat1.length; j++) {

					if (mat1[i][j] != mat2[i][j]) {
						iguales = false;
						break;
					}
				}
			}

			if (iguales) {
				System.out.print("MATRICES = ");
			} else {
				System.out.print("MATRICES ≠ ");
			}

		} else {
			System.out.print("MATRICES ≠ TAMAÑO");
		}
	}
}