package g.a.polimorfismoyintroduccionSobreCarga;

import java.util.Random;

public class VerticeTrianguloPrincipalPracticar {

	public static void main(String[] args) {
		
		int aux1, aux2;
		Random rand = new Random(System.nanoTime());

		aux1 = rand.nextInt(10);
		aux2 = rand.nextInt(10);
		
		VerticePracticar a = new VerticePracticar(5, 25);
		
		aux1 = rand.nextInt(10);
		aux2 = rand.nextInt(10);
		
		VerticePracticar b = new VerticePracticar(aux1, aux2); 
		
		aux1 = rand.nextInt(10);
		aux2 = rand.nextInt(10);
		
		VerticePracticar c = new VerticePracticar(aux1, aux2); 
		
		TrianguloPracticar t1 = new TrianguloPracticar(a, b, c);
		
		//PRIMERA SOLUCION
		VerticePracticar temp = new VerticePracticar(t1.getA());
		
		System.out.println("El valor x del objeto temp es: "+temp.getX());
		System.out.println("El valor y del objeto temp es: "+temp.getY());
		
		temp.setX(10);
		temp.setY(35);
		
		System.out.println("El valor x del objeto temp es: "+a.getX());
		System.out.println("El valor y del objeto temp es: "+a.getY());
	}

}