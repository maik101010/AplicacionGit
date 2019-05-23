import java.util.*;
class Ejercicios {
	public static void main(String[] args) {
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta", "plateado" };

		List<String> list1 = new LinkedList<>();

		for (String string : colores) {
			list1.add(string);
		}

		String[] colores2 = { "dorado", "blanco", "cafe", "azul", "gris", "plateado" };

		List<String> list2 = new LinkedList<>();

		for (String string : colores2) {
			list2.add(string);
		}

		list1.addAll(list2); // Concatenamos las listas

		list2 = null; // liberamos recursos
		imprimirLista(list1);

		convetirMayusculas(list1);
		imprimirLista(list1);

		System.out.printf("%nEliminando elementos del 4 a 6...");
		eliminarElementos(list1, 4, 7);
		imprimirLista(list1);
		imprimirListaInversa(list1);

	}

	private static void imprimirLista(List<String> list1) {
		System.out.printf("%nlista:%n");
		for (String string : list1) {
			System.out.printf("%s ", string);
		}
	}

	private static void eliminarElementos(List<String> list1, int i, int j) {

		list1.subList(i, j).clear();// Elimina elementos
	}

	private static void convetirMayusculas(List<String> list1) {

		ListIterator<String> iterador = list1.listIterator();

		while (iterador.hasNext()) {
			String color = (String) iterador.next();
			iterador.set(color.toUpperCase()); // convetimos a mayuscula
		}
	}
	private static void imprimirListaInversa(List<String> list1) {
		ListIterator<String> iterador = list1.listIterator(list1.size());
		System.out.printf("%nLista inversa:%n");
		while (iterador.hasPrevious()) {
			System.out.printf("%s ", iterador.previous());
			
		}
	}
}














































}