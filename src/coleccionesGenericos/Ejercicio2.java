import java.util.*;
/**
 * Imprimimos lista al revez
 */
class Ejercicio2 {
	public static void main(String[] args) {
		Integer[] numeros = {2,3,4,1,2}; 

		List<Integer> lista = Arrays.asList(numeros);
		imprimir(lista);
		System.out.println("Inversa..");
		Collections.reverse(lista);
		imprimir(lista);

	}
	
	private static void imprimir(List<Integer> lista){
		for (Integer valores : lista) {
			System.out.printf("%s ", valores);
		}
		System.out.printf("%nMax: %s", Collections.max(lista));
		System.out.printf("%nMin: %s%n", Collections.min(lista));

	}
}