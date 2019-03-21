import java.util.*;
public class CompareList {

public static List<Integer> listaCompare(List<Integer> a, List<Integer> b){
	int contA=0;
	int contB=0;
	int contPosiciones=0;
	Integer[] array= new Integer[2];
	array[0]=0;
	array[1]=0;
	for (int i = 0; i<a.size(); i++) {
		if (a.get(i)>b.get(i)) {
			contB++;
			array[0]=contB;		
			contPosiciones++;
			
		}else if(a.get(i)<b.get(i)){
			contA++;
			array[1]=contA;
			contPosiciones++;
			
		}else if(a.get(i)==b.get(i)){
			contPosiciones++;			
			if (contPosiciones>2) {
				break;				
			}
			array[i]=0;
		}
	}
	List<Integer> lista = Arrays.asList(array);
	

	return lista;

}

// Complete the aVeryBigSum function below.

public static long aVeryBigSum(long[] ar) {
	Long numeroSuma=0L;
	for (int i=0;i<ar.length; i++) {
		//System.out.println("entramos");

		numeroSuma+=ar[i];
	}

	return numeroSuma;
}



public static int metodo(int n){
	if (n<=2) {
		return n;
	}
	return metodo(n-1)*metodo(n-2);
}

  
public static void main(String[] args) {
	
	//---Ejercicio Comparar Lista
	/*Integer[] arrayA = new Integer[] {1,2,3};
	Integer[] arrayB = new Integer[] {1,2,3};
	List<Integer> b = Arrays.asList(arrayB);*/
	int respuesta = metodo(5);
	System.out.print(respuesta);
	/*List<Integer> respuesta =listaCompare(a,b);

	for (int i = 0; i<respuesta.size() ;i++ ) {
		System.out.println(respuesta.get(i));
	}*/
	//---Ejercicio de suma de long
	/*long arraySum[] = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
	System.out.print(aVeryBigSum(arraySum));*/

}
	
}
