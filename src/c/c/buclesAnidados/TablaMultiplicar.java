package c.c.buclesAnidados;

public class TablaMultiplicar {

	public static void main(String[] args) {

		// TABLA DE MULTIPLICAR 1 - 10
		int resultado;

		for (int i = 1; i <= 10; i++) {

			System.out.println();
			System.out.println("Tabla del " + i);
			System.out.println();

			for (int j = 1; j <= 10; j++) {
				resultado = i * j;
				System.out.println(i + " * " + j + " = " + resultado);

			}
		}
	}
}