class Arreglo {

	public static void main(String[] args) {
		/**
		 * Array o arreglo de una dimension
		 */
		/*int [] arreglo = new int[4];

		arreglo[0] = 2;
		arreglo[1] = 1;
		arreglo[2] = 10;
		arreglo[3] = 7;*/


		/*int [] arreglo = {2,1,10,7};

		//System.out.println(arreglo[2]);
		for (int i=0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}*/

		/**
		 * Array de dos dimensiones
		 */
		int [][] arreglo = new int [3][3];

		arreglo[0][0] = 0;
		arreglo[0][1] = 1;
		arreglo[0][2] = 2;		
		arreglo[1][0] = 4;
		arreglo[1][1] = 3;
		arreglo[1][2] = 7;
		arreglo[2][0] = 3;
		arreglo[2][1] = 8;
		arreglo[2][2] = 1;

		/*int [][] arreglo ={
			{0,1,2},
			{4,3,7},
			{3,8,1},
		};*/

		for (int i=0;i<arreglo.length;i++) {
			for (int j=0;j<arreglo[i].length;j++) {
				System.out.println("{"+arreglo[i][j]+"}");
			}
			System.out.println("");
		}

	}
	
}
