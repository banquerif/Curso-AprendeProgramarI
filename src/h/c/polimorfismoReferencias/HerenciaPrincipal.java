package h.c.polimorfismoReferencias;

public class HerenciaPrincipal {

	public static void main(String[] args) {

		// COCHE = |NOMBRE, VELOCIDAD, POTENCIA, NUMERO PUERTAS
		// MOTO = |NOMBRE, VELOCIDAD, POTENCIA, CADENA ROTA
		
		HerenciaVehiculo coche = new HerenciaCoche("Coche", 0, 30, 5);
		HerenciaVehiculo moto = new HerenciaMoto("Moto", 0, 60, false);

		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());
		
		coche.acelerar();
		moto.acelerar();

		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());
		
		coche.frenar();
		moto.frenar();
		
		System.out.println("La velodidad del " + coche.getNombre() + " es " + coche.getVelocidad());

		System.out.println("La velocidad de la " + moto.getNombre() + " es " + moto.getVelocidad());

	}

}