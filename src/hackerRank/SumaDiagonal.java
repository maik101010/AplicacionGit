class SumaDiagonal {
	static int diagonalDifference(int[][] arr) {
	int diagonal=0;
	int contDiagonal=0;
	int diagonalInversa=0;
	int contDiagonalInversa=0;
	int cont=0;
	int res=0;
	/* ----Segunda respuesta----*/
	
	// int diff = 0;
	// for (int i = 0; i < arr.length; i++) {
	//    diff += arr[i][i] - arr[i][arr.length - i - 1];

	// }
	// return Math.abs(diff);
    
	for (int i=0; i<arr.length; i++) {
		for (int j=0;j<arr[i].length; j++ ) {
			int other = arr[i].length - i - 1;
			diagonal= arr[i][cont];
			diagonalInversa= arr[i][other];

		}
		contDiagonal += diagonal;
		contDiagonalInversa += diagonalInversa;		
		cont++;
	
	}
	res = Math.abs(contDiagonal - contDiagonalInversa);
		
	return res;


}

public static void main(String[] args) {
	//---Ejercicio de resta en diagonal de un arreglo
	int[][] array = {
      {1, 2, 3}, 
      {4, 5, 6}, 
      {9, 8, 9}, 
	};
	System.out.println(diagonalDifference(array));

}

}