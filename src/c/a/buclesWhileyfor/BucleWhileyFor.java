//BUCLE WHILE | BUCLE FOR

package c.a.buclesWhileyfor;

public class BucleWhileyFor {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2;
		
		//BUCLE WHILE
		while(n1 < 5) {
			
			System.out.print(n1+" ");
			n1++;
		}
		
		System.out.println();
		
		//BUCLE FOR
		//1. INICIALIZAR EL CONTADOR
		//2. CONDICION
		//3. INCREMENTO DEL CONTADOR
		for(n2 = 0; n2 < 5; n2++) {
			System.out.print(n2+" ");
		}
		
	}

}