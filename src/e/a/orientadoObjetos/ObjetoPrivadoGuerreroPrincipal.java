//CREAR UN GUERRERO MEDIANTE OBJETOS CON ATRIBUTOS PRIVADOS | SIN EL USO DE CONSTRUCTORES

package e.a.orientadoObjetos;

import java.io.IOException;

public class ObjetoPrivadoGuerreroPrincipal {

	public static void main(String[] args) {
		
		ObjetoPrivadoGuerrero guerrero_a = new ObjetoPrivadoGuerrero();
		ObjetoPrivadoGuerrero guerrero_b = new ObjetoPrivadoGuerrero();
		
		int golpe_total;
		
//		Random rand = new Random(System.nanoTime());
//		int fuerza, golpe_total;
		
		guerrero_a.setNombre("Guerrero1");
		guerrero_a.setAtaque(10);
		guerrero_a.setSalud(100);
		
		guerrero_b.setNombre("Guerrero2");
		guerrero_b.setAtaque(10);
		guerrero_b.setSalud(100);
		
		int guerreroA_salud = guerrero_a.getSalud(), guerreroB_salud = guerrero_b.getSalud();
		
		System.out.println("Nombre: "+guerrero_a.getNombre());
		System.out.println("Puntos: "+guerrero_a.getAtaque());
		System.out.println("Salud: "+guerrero_a.getSalud());
		
		System.out.println();
		
		System.out.println("Nombre: "+guerrero_b.getNombre());
		System.out.println("Puntos: "+guerrero_b.getAtaque());
		System.out.println("Salud: "+guerrero_b.getSalud());
		
		System.out.println();
		
		while(guerreroA_salud > 0 && guerreroB_salud > 0) {
			
			//CODIGO ATACAR
			golpe_total = guerrero_a.ataque();
			guerreroB_salud -= golpe_total;
			
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//DAÑO (GUERRERO A) A (GUERRERO B)
			if(guerreroB_salud < 0) {
				guerreroB_salud = 0;
				System.out.println(guerrero_a.getNombre()+" (daño ("+golpe_total+"))"+" 🗡️ "+guerrero_b.getNombre()+" (salud ("+guerreroB_salud+"))");
			} else {
				System.out.println(guerrero_a.getNombre()+" (daño ("+golpe_total+"))"+" 🗡️ "+guerrero_b.getNombre()+" (salud ("+guerreroB_salud+"))");
			}
			
			//CODIGO ATACAR
			golpe_total = guerrero_b.ataque();
			guerreroA_salud -= golpe_total;
			
//			fuerza = rand.nextInt(5);
//			golpe_total = fuerza * guerrero_a.getAtaque();
//			
//			guerreroA_salud -= golpe_total;
			
			
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//DAÑO (GUERRERO B) A (GUERRERO A)
			if(guerreroA_salud < 0) {
				guerreroA_salud = 0;
				System.out.println(guerrero_b.getNombre()+" (daño ("+golpe_total+"))"+" 🗡️ "+guerrero_a.getNombre()+" (salud ("+guerreroA_salud+"))");
			} else {
				System.out.println(guerrero_b.getNombre()+" (daño ("+golpe_total+"))"+" 🗡️ "+guerrero_a.getNombre()+" (salud ("+guerreroA_salud+"))");
			}
			
			System.out.println();
			
			if(guerreroA_salud == 0 && guerreroB_salud == 0) {
				System.out.println("¡Empate!");
			}
			else if(guerreroB_salud == 0) {
				System.out.println("¡Ha Ganado 🏅 "+guerrero_a.getNombre()+"!");
			}
			else if(guerreroA_salud == 0) {
				System.out.println("¡Ha Ganado 🏅 "+guerrero_b.getNombre()+"!");
			}
		}
	}
}