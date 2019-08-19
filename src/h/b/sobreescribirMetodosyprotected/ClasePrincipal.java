package h.b.sobreescribirMetodosyprotected;

public class ClasePrincipal {

	public static void main(String[] args) {

		// HUMANO = |NOMBRE, POTENCIA, FUERZA, DEFENSA
		// GUERRERO = |NOMBRE, POTENCIA, FUERZA, DEFENSA, ARMADURA

		int ataque;
		ClaseHumano hum1 = new ClaseHumano("Humano1", 0, 0, 0);

		ClaseGuerrero gue1 = new ClaseGuerrero("Guerrero1", 0, 0, 0, 0);

		// UTILIZANDO EL METODO PROTECTED (TODAS LAS CLASES DEL MISMO PAQUETE Y LAS
		// CLASES QUE HEREDAN, PUEDEN UTILIZAR LOS ATRIBUTOS DEL OBJETO)
		hum1.potencia = 5;
		hum1.fuerza = 10;
		hum1.defensa = 100;
		
		gue1.potencia = 5;
		gue1.fuerza = 10;
		gue1.defensa = 100;
		gue1.armadura = 500;

		ataque = gue1.atacar();

		System.out.println("Guerrero "+ataque);

		gue1.respuesta(ataque);
		
		

		ataque = hum1.atacar();

		System.out.println("Humano "+ataque);

		hum1.respuesta(ataque);

	}
}