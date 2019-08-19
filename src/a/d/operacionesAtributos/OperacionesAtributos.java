package a.d.operacionesAtributos;

public class OperacionesAtributos {

	public static void main(String[] args) {
		
		int n1,n2,sumar,restar,multiplicar,dividir,resto;
		
		n1 = 10;
		n2 = 5;
		
		sumar = n1 + n2;
		restar = n1 - n2;
		multiplicar = n1 * n2;
		dividir = n1 / n2;
		resto = n1 % n2;
		
		System.out.println("Operaciones con Atributos");
		System.out.println();
		
		//Operaciones Matematicas
		System.out.println(". Sumar: "+n1+" + "+n2+" = "+sumar);
		System.out.println(". Restar: "+n1+" - "+n2+" = "+restar);
		System.out.println(". Multiplicar: "+n1+" * "+n2+" = "+multiplicar);
		System.out.println(". Dividir: "+n1+" / "+n2+" = "+dividir);
		System.out.println(". Resto: "+n1+" % "+n2+" = "+resto);
		
	}
	
}