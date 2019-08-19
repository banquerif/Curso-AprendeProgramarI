package g.a.polimorfismoyintroduccionSobreCarga;

public class SobreCargaMetodosPrincipal {

	public static void main(String[] args) {
		
		SobreCargaMetodos sobrecarga = new SobreCargaMetodos();
	
		sobrecarga.setN(10);
		sobrecarga.setN(20.5);
		
		sobrecarga.setN(20, 30.5);
		sobrecarga.setN(40.5, 30);
		
		System.out.println(sobrecarga.getN1()+" | "+sobrecarga.getN2());
		
	}

}