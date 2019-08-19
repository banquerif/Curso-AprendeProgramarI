//TIPO CHAR - SOLO ALMACENA UN CARACTER

package b.c.charyswitch;

public class AtributoChar {
	
	public static void main(String[] args) {
		
		char letra_b = 'b', letra_a = 'a', letra_n = 'n', letra_q = 'q';
		char letra_u = 'u', letra_e = 'e', letra_r = 'r', letra_i = 'i';
		
		if(letra_b == 'b') {
			System.out.println("La primera letra de apellido es la "+letra_b);
			System.out.println("Mi primer apellido es "+letra_b+letra_a+letra_n+letra_q+letra_u+letra_e+letra_r+letra_i);
		}
		else {
			System.out.println("El valor no es (B)");
		}
	}

}