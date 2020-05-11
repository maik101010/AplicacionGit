package algoritmos.lambda;

import java.util.*;
class Ejemplo2 {
	
	public static void main(String[] args) {
		int [] dinosaurios = new int[5];
		dinosaurios[0]=0;
		int [] robotDinosaurios = dinosaurios;
		
		addArreglo(dinosaurios);
		addArreglo(robotDinosaurios);

		Arrays.stream(dinosaurios).forEach(System.out::println);

	}
	private static void addArreglo(int [] arregloDinosaurio){
		for (int i=0; i<arregloDinosaurio.length;i++ ) {
			arregloDinosaurio[i] = arregloDinosaurio[i]+2;
			
		}

	}
	
}