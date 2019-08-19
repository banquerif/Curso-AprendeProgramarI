//SE UTILIZA LA CLASE VECTOR | CUANDO NO SABEMOS EL TAMAÑO DEL MISMO

package d.a.vectorI;

import java.util.Vector;

public class ObjetoVectorI {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement(3);
		vec.addElement(4);
		vec.addElement(5);
		vec.addElement(6);
		vec.addElement(7);
		vec.addElement(8);
		vec.addElement(9);
		vec.addElement(10);
		
		int i = vec.elementAt(9);
		
		while(vec.size() < 100) {
			i++;
			vec.addElement(i);
			
		}
		
		
		for(int j = 0; j < vec.size(); j++) {
			System.out.print(vec.elementAt(j)+" ");
		}
		
	}
}