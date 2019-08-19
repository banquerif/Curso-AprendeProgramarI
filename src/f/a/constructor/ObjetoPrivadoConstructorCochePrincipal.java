package f.a.constructor;

public class ObjetoPrivadoConstructorCochePrincipal {
	
	public static void main(String[] args) {
		
		// NOMBRE, ACELERACION, VELOCIDAD
		ObjetoPrivadoConstructorCoche mercedes = new ObjetoPrivadoConstructorCoche("Mercedes CLA", 10, 20);
		
		 System.out.println("Nombre: "+mercedes.getNombre()+", Velocidad: "+mercedes.getVelocidad()+", Aceleracion: "+mercedes.getAceleracion());
		 
		 mercedes.acelerar(20);
		 mercedes.frenar();
		 
		 System.out.println("Nombre: "+mercedes.getNombre()+", Velocidad: "+mercedes.getVelocidad()+", Aceleracion: "+mercedes.getAceleracion());
		 
		 
	}
}