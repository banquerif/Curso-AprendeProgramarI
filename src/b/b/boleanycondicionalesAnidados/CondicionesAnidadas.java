//IF / ELSE (ANIDADOS)

package b.b.boleanycondicionalesAnidados;

public class CondicionesAnidadas {

	public static void main(String[] args) {

		int temperatura = 35;

		//IF / ELSE (ANIDADOS) | CORRECTO
//		if (temperatura >= 30 && temperatura <= 50) {
//			System.out.println("Ambiente Calor");
//		} else if (temperatura >= 20  && temperatura <= 29) {
//			System.out.println("Ambiente Normal");
//		} else if (temperatura >= 0 && temperatura <= 19) {
//			System.out.println("Ambiente Frio");
//		}
		
		//INCORRECTO
//		if(temperatura >= 30 && temperatura <= 50) {
//			System.out.println("Ambiente Calor");
//		}
//		if(temperatura >= 20  && temperatura <= 29) {
//			System.out.println("Ambiente Normal");
//		}
//		if(temperatura >= 0 && temperatura <= 19) {
//			System.out.println("Ambiente Frio");
//		}
		
		System.out.println();
		System.out.println("*** Caso Correcto ***");
		System.out.println();
		
		//CASO - CORRECTO
		if (temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Calor");
		} else if (temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Normal");
		} else if (temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Frio");
		}
		
		System.out.println();
		System.out.println("*** Caso Incorrecto ***");
		System.out.println();
		
		//CASO - INCORRECTO
		if(temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Calor");
		}
		if(temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Normal");
		}
		if(temperatura >= 30 && temperatura <= 50) {
			System.out.println("Ambiente Frio");
		}
	}
}