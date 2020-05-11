package algoritmos.coleccionesGenericos;

import java.util.*;
/**
 * Imprimimos lista al revez
 */
class Ejercicio2 {
	public static void main(String[] args) {
		/*Integer[] numeros = {2,3,4,1,2}; 

		List<Integer> lista = Arrays.asList(numeros);
		imprimir(lista);
		System.out.println("Inversa..");
		Collections.reverse(lista);
		imprimir(lista);*/
		int count = 0;
		int x = 3;
		while(count++ < 3){
			int y = (1+2 * count)%3;
			System.out.println(count);
			switch (y) {
				default:
				case 0 : x -= 1; break;
				case 1 : x += 5;
				case 2 : System.out.print("entramos en dos");
 x +=10;
			}

		}
	System.out.print(x);

	}
	
	private static void imprimir(List<Integer> lista){
		for (Integer valores : lista) {
			System.out.printf("%s ", valores);
		}
		System.out.printf("%nMax: %s", Collections.max(lista));
		System.out.printf("%nMin: %s%n", Collections.min(lista));

	}
}