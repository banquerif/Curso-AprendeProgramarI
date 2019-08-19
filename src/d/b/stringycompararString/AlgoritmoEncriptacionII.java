package d.b.stringycompararString;

import java.util.Scanner;

public class AlgoritmoEncriptacionII {

	public static void main(String[] args) {

		String palabra_e;
		char[] vec_abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		String concatenar = "";
		int numero_clave;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la palabra a encriptar: ");
		palabra_e = sc.nextLine();

		System.out.print("Introduce el numero para encriptar: ");
		numero_clave = sc.nextInt();
		sc.close();

		char[] vec_lNormal = new char[palabra_e.length()];

		char[] vec_lEncriptado = new char[palabra_e.length()];

		System.out.println();
		System.out.print("Palabra Introducida = ");
		for (int i = 0; i < palabra_e.length(); i++) {

			vec_lNormal[i] = palabra_e.charAt(i);
			System.out.print(vec_lNormal[i]);
		}

		System.out.println();

		// ENCRIPTAR
		System.out.println("Encriptar");
		for (int i = 0; i < palabra_e.length(); i++) {
			for (int j = 0; j < vec_abecedario.length; j++) {

//				System.out.println("vec_abecedario[j]"+j);

				if (vec_abecedario[j] == palabra_e.charAt(i)) {
					System.out.println("abecedario " + vec_abecedario[j] + " - (" + j + ") es igual a palabra "
							+ palabra_e.charAt(i) + " (" + i + ")");

					// DAR LA VUELTA AL ABECEDARIO

					if (j + numero_clave <= 26) { // NO ES MAYOR QUE (26)
						vec_lEncriptado[i] = vec_abecedario[j + numero_clave];
						break;
					} else if (j + numero_clave > 26 && j == 0) { // A
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 27];
						break;
					} else if (j + numero_clave > 26 && j == 1) { // B
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 26];
						break;
					} else if (j + numero_clave > 26 && j == 2) { // C
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 25];
						break;
					} else if (j + numero_clave > 26 && j == 3) { // D
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 24];
						break;
					} else if (j + numero_clave > 26 && j == 4) { // E
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 23];
						break;
					} else if (j + numero_clave > 26 && j == 5) { // F
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 22];
						break;
					} else if (j + numero_clave > 26 && j == 6) { // G
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 21];
						break;
					} else if (j + numero_clave > 26 && j == 7) { // H
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 20];
						break;
					} else if (j + numero_clave > 26 && j == 8) { // I
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 19];
						break;
					} else if (j + numero_clave > 26 && j == 9) { // J
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 18];
						break;
					} else if (j + numero_clave > 26 && j == 10) { // K
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 17];
						break;
					} else if (j + numero_clave > 26 && j == 11) { // L
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 16];
						break;
					} else if (j + numero_clave > 26 && j == 12) { // M
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 15];
						break;
					} else if (j + numero_clave > 26 && j == 13) { // N
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 14];
						break;
					} else if (j + numero_clave > 26 && j == 14) { // Ñ
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 13];
						break;
					} else if (j + numero_clave > 26 && j == 15) { // O
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 12];
						break;
					} else if (j + numero_clave > 26 && j == 16) { // P
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 11];
						break;
					} else if (j + numero_clave > 26 && j == 17) { // Q
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 10];
						break;
					} else if (j + numero_clave > 26 && j == 18) { // R
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 9];
						break;
					} else if (j + numero_clave > 26 && j == 19) { // S
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 8];
						break;
					} else if (j + numero_clave > 26 && j == 20) { // T
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 7];
						break;
					} else if (j + numero_clave > 26 && j == 21) { // U
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 6];
						break;
					} else if (j + numero_clave > 26 && j == 22) { // V
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 5];
						break;
					} else if (j + numero_clave > 26 && j == 23) { // W
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 4];
						break;
					} else if (j + numero_clave > 26 && j == 24) { // X
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 3];
						break;
					} else if (j + numero_clave > 26 && j == 25) { // Y
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 2];
						break;
					} else if (j + numero_clave > 26 && j == 26) { // Z
						j = 0;
						vec_lEncriptado[i] = vec_abecedario[(j + numero_clave) - 1];
						break;
					}
				}
			}
		}
		for (int i = 0; i < palabra_e.length(); i++) {
			concatenar += vec_lEncriptado[i];
		}
		
		System.out.println();
		System.out.println(concatenar);
		palabra_e = concatenar;
		
		// DESENCRIPTAR
		System.out.println();
		System.out.println("Desencriptar");
		for (int i = 0; i < palabra_e.length(); i++) {
			for (int j = 0; j < vec_abecedario.length; j++) {

				if (vec_abecedario[j] == palabra_e.charAt(i)) {
					System.out.println("abecedario " + vec_abecedario[j] + " - (" + j + ") es igual a palabra "
							+ palabra_e.charAt(i) + " (" + i + " )");
					
					// DAR LA VUELTA AL ABECEDARIO
					if(j + numero_clave <= 26) { // NO ES MAYOR QUE (26)
						vec_lNormal[i] = vec_abecedario[j - numero_clave];
						break;
					}
					else if (j + numero_clave > 26 && j == 0) { // A
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 1];
						break;
					} else if (j + numero_clave > 26 && j == 1) { // B
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 2];
						break;
					} else if (j + numero_clave > 26 && j == 2) { // C
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 3];
						break;
					}else if(j + numero_clave > 26 && j == 3) { // D
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 4];
						break;
					}else if(j + numero_clave > 26 && j == 4) { // E
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) +5];
						break;
					}else if(j + numero_clave > 26 && j == 5) { // F
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 6];
						break;
					}else if(j + numero_clave > 26 && j == 6) { // G
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 7];
						break;
					}else if(j + numero_clave > 26 && j == 7) { // H
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 8];
						break;
					}else if(j + numero_clave > 26 && j == 8) { // I
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 9];
						break;
					}else if(j + numero_clave > 26 && j == 9) { // J
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 10];
						break;
					}else if(j + numero_clave > 26 && j == 10) { // K
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 11];
						break;
					}else if(j + numero_clave > 26 && j == 11) { // L
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 12];
						break;
					}else if(j + numero_clave > 26 && j == 12) { // M
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 13];
						break;
					}else if(j + numero_clave > 26 && j == 13) { // N
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 14];
						break;
					}else if(j + numero_clave > 26 && j == 14) { // Ñ
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 15];
						break;
					}else if(j + numero_clave > 26 && j == 15) { // O
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 16];
						break;
					}else if(j + numero_clave > 26 && j == 16) { // P
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 17];
						break;
					}else if(j + numero_clave > 26 && j == 17) { // Q
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 18];
						break;
					}else if(j + numero_clave > 26 && j == 18) { // R
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 19];
						break;
					}else if(j + numero_clave > 26 && j == 19) { // S
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 20];
						break;
					}else if(j + numero_clave > 26 && j == 20) { // T
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 21];
						break;
					}else if(j + numero_clave > 26 && j == 21) { // U
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 22];
						break;
					}else if(j + numero_clave > 26 && j == 22) { // V
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 23];
						break;
					}else if(j + numero_clave > 26 && j == 23) { // W
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 24];
						break;
					}else if(j + numero_clave > 26 && j == 24) { // X
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 25];
						break;
					}else if(j + numero_clave > 26 && j == 25) { // Y
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 26];
						break;
					}else if(j + numero_clave > 26 && j == 26) { // Z
						j = 26;
						vec_lNormal[i] = vec_abecedario[(j - numero_clave) + 27];
						break;
					}

//					vec_lEncriptado[i] = vec_abecedario[j - numero_clave];
				}
			}
		}
		
		concatenar = "";
		
		System.out.println();
		for (int i = 0; i < palabra_e.length(); i++) {
			concatenar += vec_lNormal[i];
		}
		
		System.out.println(concatenar);
	}
}