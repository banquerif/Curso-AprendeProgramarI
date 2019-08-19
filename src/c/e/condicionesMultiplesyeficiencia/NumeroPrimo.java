//ENCONTRAR CUANTOS NUMEROS PRIMOS HAY ENTRE 1 Y 200

package c.e.condicionesMultiplesyeficiencia;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		boolean primo = true;
		
		//PRIMO - NUMERO DIVISIBLE ENTRE EL MISMO Y 1
		for(int i = 1; i <= 200; i++) {
			
			primo = true;
			
			for(int j = 2; j < i; j++) {
			
				if(i % j == 0) {
					primo = false;
					break;
				}
			}
			
			if(primo) {
				System.out.print("("+i+") ");
			} else {
				System.out.print("X ");
			}
		}
	}
}