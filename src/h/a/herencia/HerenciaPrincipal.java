package h.a.herencia;

public class HerenciaPrincipal {

	public static void main(String[] args) {

		// COCHE = |NOMBRE, VELOCIDAD, POTENCIA, NUMERO PUERTAS
		// MOTO = |NOMBRE, VELOCIDAD, POTENCIA, CADENA ROTA

		HerenciaCoche coche = new HerenciaCoche("Coche", 0, 30, 5);
		HerenciaMoto moto = new HerenciaMoto("Moto", 0, 60, false);

		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad del " + moto.getNombre() + " es " + moto.getVelocidad());
		
		coche.acelerar();
		moto.acelerar();

		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad del " + moto.getNombre() + " es " + moto.getVelocidad());
		
		coche.frenar();
		moto.frenar();
		
		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad del " + moto.getNombre() + " es " + moto.getVelocidad());

	}

}