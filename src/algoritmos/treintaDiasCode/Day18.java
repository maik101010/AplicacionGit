package algoritmos.treintaDiasCode;

class Day18{
	static int isPalindrome(String palabra){
		int contNoPa=0;
		for (int i =0;i<palabra.length();i++) {
			int posicion = palabra.length() - i - 1;
			char letra = palabra.charAt(posicion);

			if (letra != palabra.charAt(i)) {
		        contNoPa++;		        
			}
		}
		if (contNoPa>=1) {
			return 1;
		}else{
			return 0;
		}	
	
	}
	public static void main(String[] args) {
		int respuesta = isPalindrome("somarramoss");
		if (respuesta==1) {
			System.out.print("No es palindromo");
		}else{
			System.out.print("Es palindromo");
		}
		
	}

	
}