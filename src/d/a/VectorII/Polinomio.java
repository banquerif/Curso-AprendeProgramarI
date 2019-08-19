//CONSTRUCTORES - SE INICIALIZA, PERO NO SE VAN CREAR, INICIALIZAR O RESERVAR MEMORIA

package d.a.VectorII;

import java.util.Random;

public class Polinomio {
	
	private Vertice[] v;

	public Polinomio(int tam) {
		int aux1, aux2;
		Random rand = new Random(System.nanoTime());
		v = new Vertice[tam];
		
		for(int i = 0; i < tam; i++) {
			aux1 = rand.nextInt(10);
			aux2 = rand.nextInt(10);
			
			v[i] = new Vertice(aux1, aux2);
		}
	}
	
	public void mostrar(int i) {
		Vertice aux = v[i];
		
		System.out.println("El valor de la posicion i: "+i+" es x: "+aux.getX()+" y: "+aux.getY());
	}
}