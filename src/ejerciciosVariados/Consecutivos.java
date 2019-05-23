import java.util.*;
class Consecutivos {
	
	public static void main(String[] args) {
		int [] datos = {
			2223333,
			2123123,
			2222111,
			2223333,
			6666666,
			3243233,
			7775555,
			7775555,
			5655553,
			7775555,
		};
		int valor = 1;
		int cont = 0; 
		int total= 0;

		List<Integer> conjuntos = new ArrayList<>();
		int [] conjunto;

		for (int i =0; i<datos.length; i++) {
			cont++;
			valor *= datos[i];
			if (cont==5) {				
				total = valor;
				conjuntos.add(total);
				cont=0;
				valor =1;		
			}			
		}										 
		int mayor = conjuntos.get(0);  //180  - 190 - 200
		for (int i=0; i<conjuntos.size(); i++) {
			if (mayor < conjuntos.get(i)) {
				mayor = conjuntos.get(i);
			}
			
		}		
		System.out.println("El producto mayor es " + mayor);

	}
}