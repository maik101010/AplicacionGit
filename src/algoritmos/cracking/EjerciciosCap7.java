package algoritmos.cracking;

/**
 * Capitulo 7 del libro Craking the coding interview
 */
class EjerciciosCap7{
	/**
	 * metodo que devuelve el número minimo de un arreglo de enteros
	 * @param  array arreglo de enteros
	 * @return      el número minimo
	 */
	static int minIndex(int [] array){
		int minindex = 0;
		for (int i= 1; i < array.length; i++) {
			if (array[i] < array[minindex]) {
				minindex = i;
			}
		}
		return minindex;
	}
	/**
	 * metodo que devuelve el número máximo de un arreglo de enteros
	 * @param  array arreglo de enteros
	 * @return      el número máximo
	 */
	static int maxIndex(int [] array){
		int maxindex = 0;
		for (int i= 1; i < array.length; i++) {
			if (array[i] > array[maxindex]) {
				maxindex = i;
			}
		}
		return maxindex;
	}
	/**
	 * Metodo para intercambiar los valores minimo y maximo
	 * @param array    el arreglo de números
	 * @param minindex valor minimo
	 * @param maxindex valor máximo
	 */
	static void intercambio(int [] array, int minindex, int maxindex){
		int temp= array[minindex];
		array[minindex] = array[maxindex];
		System.out.println("array[minindex]: " +array[minindex]);
		array[maxindex] = temp; 
		System.out.println("array[maxindex]: " +array[maxindex]);
	}

	static void swapMinMax(int[] array) {
		int minimo = minIndex(array);
		int maximo = maxIndex(array);
		intercambio(array, minimo, maximo);
	}

	public static void main(String[] args) {
		int [] array = {2,3,2,9,5,2,1,1,4};
		System.out.print(minIndex(array));
		
	}
}