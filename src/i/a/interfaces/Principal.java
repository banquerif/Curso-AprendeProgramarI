package i.a.interfaces;

public class Principal {

	public static void main(String[] args) {
		

		ClaseInterfaz ins = new ImplementarInterfaz();
		
		ClaseAbstracta abs = new HeredarAbstracta();
		
		ins.metodoA();
		ins.metodoB();
		
		System.out.println(abs.devolverA());
		System.out.println(abs.devolverB());
	}

}