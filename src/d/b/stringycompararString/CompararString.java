package d.b.stringycompararString;

public class CompararString {

	public static void main(String[] args) {
		
		String palabra1 = "Sandia";
		String palabra2 = "Sandia";
		
		if(palabra1.length() == palabra2.length()) {
			System.out.println("MISMO T");
		}
		
		if(palabra1 == palabra2) {
			System.out.println("MISMA P");
		}
		
		System.out.println(palabra1 += " + Albaricoque");
		
	}
}