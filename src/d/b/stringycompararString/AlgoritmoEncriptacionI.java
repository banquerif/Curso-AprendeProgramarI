//ALGORITMO DE ENCRIPTACION - CIFRADO DE CESAR

package d.b.stringycompararString;

import java.util.Scanner;

public class AlgoritmoEncriptacionI {

	public static void main(String[] args) {
		
		String f1,f2;
		int desp;
		f2 = "";
		
		Scanner sc = new Scanner(System.in);
											
		String min = "abcdefghijklmnopqrstuvwxyz"; 
		String max = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.print("Introduce una frase: ");
		f1 = sc.nextLine();
		
		System.out.print("Introduce la clave de desplazamiento: ");
		desp = sc.nextInt();
		sc.close();
													
		for(int i = 0; i < f1.length(); i++){	
			for(int j = 0; j < min.length(); j++){		
				if(f1.charAt(i) == min.charAt(j)){		
					if(j + desp >= min.length()){
						f2 += min.charAt((j + desp) % min.length());
					} else{
						f2 += min.charAt(j + desp);
					}
				}
				else if(f1.charAt(i) == max.charAt(j)){
					if(j + desp >= max.length()){
						f2 += max.charAt((j + desp) % max.length());
					}else{
						f2 += max.charAt(j + desp);
					}
				}
			}
		}
		System.out.println(f1);
		System.out.println(f2);
		
		//DECODIFICACION

		String f3 = "";
		String min2 = " zyxwvutsrqponmlkjihgfedcba";
		String max2 = " ZYXWVUTSRQPONMLKJIHGFEDCBA";
		
		for(int i = 0; i < f2.length(); i++){	
			for(int j = 0; j < min2.length(); j++){	
				if(f2.charAt(i) == min2.charAt(j)){		
					if(j + desp >= min2.length()){ 
						f3 += min2.charAt((j + desp) % min2.length());
					} else{
						f3 += min2.charAt(j + desp);
					}
				}
				else if(f2.charAt(i) == max2.charAt(j)){
					if(j + desp >= max2.length()){
						f3 += max2.charAt((j + desp) % max2.length());
					}else{
						f3 += max2.charAt(j + desp);
					}
				}
			}
		}
		System.out.print(f3);
	}
}