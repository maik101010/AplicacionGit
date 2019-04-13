class Example1 {
	static int factorial(int n) {
		if (n < 0) {
			return -1;
		} else if (n==0){
			return 1;
		} else {
			return n *factorial(n-1);
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


static boolean isPrime(int n) {
	for (int x = 2; x * x <= n; x++) {
		if (n % x == 0) {

			return false;			
		}
	}
 return true;  
}

public static void main(String[] args) {
//	permutation("hola");
   //System.out.println("resultado "+ power(2, 3));
   // int numero = 3;
   // if (numero%numero==0 && numero%1==0) {
   // 	if (numero%2!=0) {
   // 		System.out.println("Es primo");   		
   // 	}
   // }
   // if(numero%2==1){

   // }
   //int i =  3;

   // for (int i=1;i<=10 ;i++ ) {   	
   // 	    boolean primo = isPrime(i);
   // 	    if (primo) {
   // 	    	System.out.println(i + " es primo");
   // 	    }
   // }
   int [] array = {1,6,2,4};
   int [] res = sumaArray(array, 8);
   System.out.println(res[0]);
   System.out.println(res[1]);
   //System.out.print(isPrime(9));
}


}
