import java.text.DecimalFormat;
class PositivosNegativosMatriz {
	static void plusMinus(int[] arr) {
		
		double totalCero;
		double ceros = 0.0;
		double totalUno;
		double positivos=0.0;
		double totalMenosUno;
		double negativos=0.0;
		for (int i=0;i<arr.length;i++ ) {
			if (arr[i]<0) {
				negativos++;
				
			}else if (arr[i]>0) {
				positivos++;
			}else{
				ceros++;
			}
		}
		totalUno=(double)positivos/arr.length;
		totalMenosUno=(double)negativos/arr.length;
		totalCero=(double)ceros/arr.length;
		System.out.printf("%.6f%n", totalUno); 
		System.out.printf("%.6f%n", totalMenosUno); 
		System.out.printf("%.6f%n", totalCero); 
		

    }
	public static void main(String[] args) {
		//int [] arr={1,1,0,-1,-1};
		//int [] arr={-4, 3, -9, 0, 4, 1};
		int [] arr={0, 0, -1, 1, 1};
		
		
		plusMinus(arr);
	}
}