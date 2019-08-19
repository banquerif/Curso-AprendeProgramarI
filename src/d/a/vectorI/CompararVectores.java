package d.a.vectorI;

public class CompararVectores {

	public static void main(String[] args) {
		
		boolean iguales = true;
		
		int[] vec1 = {1,2,3,4,5};
		int[] vec2 = {1,3,3,4,5};
		
		if(vec1.length != vec2.length) {
			System.out.println("No Iguales");
		} else {
			
			for(int i = 0; i < vec1.length; i++) {
				if(vec1[i] != vec2[i]) {
					iguales = false;
					break;
				}
			}
			
			if(iguales) {
				System.out.println("Iguales");
			} else {
				System.out.println("No Iguales");
			}	
		}
	}
}