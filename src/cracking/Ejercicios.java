class Ejercicios {
	static int metodo(int n) {
		if (n < 0) {
			return -1;
		} else if (n==0){
			return 1;
		} else {
			return n *metodo(n-1);
		}
}

static void permutation(String str) {
 	permutation(str, "");
 }

static void permutation(String str, String prefix) {
 	if (str.length() == 0) {
 		System.out.println(prefix);
 	} else {
 		for (int i= 0; i < str.length(); i++) {
 			String rem = str.substring(0, i) + str.substring(i + 1);
 			permutation(rem, prefix + str.charAt(i));
 		}
 	}
 }
 static void allFib(int n) {
	for (int i= 0; i < n; i++) {
		System.out.println(i + ": "+ fib(i));
	}
 } 
 static int fib(int n) {
 	if (n <= 0) return 0;
 	else if (n == 1) return 1;
 	return fib(n - 1) + fib(n - 2);
 }

static int potencias2(int n) {
 	if (n < 1) {
 		return 0;
 	} else if (n == 1) {
 		System.out.println(1);
 		return 1;
 	} else {
 		int prev = potencias2(n / 2);
 		int curr = prev * 2;
 		System.out.println(curr);
 		return curr;
 	}
 } 

/*
   recursivo para devolver el resultado de una multiplicacion de exponente
   parametros: a es la base, b el exponente
 */
static int power(int a, int b) {
	if (b < 0) {
		return 0;
	} else if (b == 0) {
		return 1;
	} else {
		System.out.println("return "+power(a, b-1));
		System.out.println(b);
		return a * power(a, b - 1);
		}
	}
/**
 * Busca dos números que sumados den el resultado del número que queremos buscar
 * @param  arr[]  array de numeros
 * @param  numero valor que será buscado
 * @return        array de los dos números encontrados
 */
static int [] sumaArray(int arr[], int numero){
	int [] retornar = new int[2];
	for (int i=0;i<arr.length-1; i++) {
		if (arr[i]+arr[i+1] == numero) {
			retornar[0] = arr[i];
			retornar[1] = arr[i+1];
		}
	}
	return retornar;
}
/**
 * Ordenamos un arreglo de números enteros de forma ascendente
 * @param  numeros arreglo de números enteros
 * @return         arreglo ordenado 
 */
static int [] ordenamientoAsc(int [] numeros){
	for (int i=0; i<numeros.length-1; i++) {		
		if (numeros[i]>numeros[i+1]) {
			//{1,6,2,4};
			//{3,2,1,4};
			int temp= numeros[i];
			//System.out.println("Temp: "+temp);			
			numeros[i] = numeros[i+1];
			numeros[i+1] = temp; 
			// int aux = numerosDesordenados[i+1];
			// numerosDesordenados[i+1] = numerosDesordenados[i];
			// numerosDesordenados[i]=aux;		
		}
	//	System.out.println("Ordenado: "+numerosDesordenados[i]);
	}
	return numeros;
}


static boolean isPrime(int n) {
	for (int x = 2; x * x <= n; x++) {
		if (n % x == 0) {
			return false;			
		}
	}
 	return true;
}

static int busquedaLineal(int [] numeros, int numeroBuscar){
	int resultado=-1;

	for (int i = 0; i<numeros.length; i++) {
		if (numeros[i]==numeroBuscar) {
			resultado = i;
			return resultado;
		}
	}

	return resultado;
}
/**
 * Busqueda de un número entero dentro de un array ordenado ascendentemente y que se divide en mitad
 * @param  numeros      array de enteros
 * @param  numeroBuscar número clave para ser buscado
 * @return              Posición del número encontrado dentro del array
 */
static int busquedaBinaria(int [] numeros, int numeroBuscar){
	//{15,31,46,48,52,58,59,71,72,79,83,86,98}
	// numeroBuscar = 79
	int inferior = 0;
	int superior = numeros.length-1;
	int medio = (inferior+superior+1)/2;
	int ubicacion = -1;
	while ((inferior<=superior) && (ubicacion==-1)) {
		if (numeroBuscar == numeros[medio]) {
			ubicacion = medio;
		}else if (numeroBuscar<numeros[medio]) {
			superior = medio-1;
		}else{
			inferior = medio+1;
		}
		medio = (inferior + superior+1)/2;
	}

	return ubicacion;


}

// static String[] repiteCadena(String cadena){
	
// }
public static void main(String[] args) {
	//System.out.print(x);
	//x((byte)3 + (byte)4);
	//repiteCadena("michael");

   // for (int i=1;i<=10 ;i++ ) {   	
   // 	    boolean primo = isPrime(i);
   // 	    if (primo) {
   // 	    	System.out.println(i + " es primo");
   // 	    }
   // }
   int [] array = {71,31,46,48,52,15,59,72,79,83,86,98};
   Array.sort(array);
   int resultado = busquedaBinaria(array, 31);
   if (resultado!=-1) {
   		System.out.println("Se encuentra en la posicion "+ resultado);   	
   }else{
   		System.out.println("No se encontro");   	
   }

   /*int [] resultados = ordenamientoAsc(array);

   for (int i = 0; i<resultados.length; i++) {
   		System.out.println(resultados[i]);
   }*/



   // int [] res = sumaArray(array, 8);
   // System.out.println(res[0]);
   // System.out.println(res[1]);
}

}
//Ejercicio 2
































