class Day20{
	public static void ordenarAsc(int a[]){
		int numeroIntercambios = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n - 1; j++)
			{
				if (a[j] > a[j + 1]) 
				{
					//en temporal guardamos el mayor
					int temp = a[j];
					//en a[j] guardamos el siguiente que es el menor
					a[j] = a[j + 1];
					//en a[j+1] guardamos el mayor para ocupar la posición del siguiente
					a[j+1] = temp;
					numeroIntercambios++;
				}
			}
			if (numeroIntercambios == 0) 
			{
				break;
			}
		}
		System.out.println("Array is sorted in "+numeroIntercambios+" intercambios.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);

	}

	public static void main(String[] args) {
		int []arr = {3,1,2};
		ordenarAsc(arr);
	}
	
}