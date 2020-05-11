package algoritmos.hackerRank;

import java.text.DecimalFormat;
import java.util.*;

class PositivosNegativosMatriz {

    static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        int numero = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//        	System.out.println("valor de i "+i);
            if (sumMap.get(nums[i]) != null) {
                numero = (Integer)sumMap.get(nums[i]);
                //Solucion[0] = 0 valor de la map
                solution[0] = sumMap.get(nums[i]);
                //solution[1] = 1 valor de i
                solution[1] = i;
//         		System.out.println("entramos en if, solucion vale {"+ solution[0] 
//         		 + " , " + solution[1]+ " }");	       
                break;
            }
            //clave = 18 - 2 = 16, valor = 0;
            sumMap.put(target - nums[i], i);
        }
        return solution;
    }

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
   		/*
        int nums[] = {2, 7, 11, 15};
        int target = 18;
        int solucion[] = twoSum(nums, target);
        for (int i = 0; i < solucion.length; i++) {
            System.out.print(solucion[i]);
        }*/

		//int [] arr={1,1,0,-1,-1};
		//int [] arr={-4, 3, -9, 0, 4, 1};
		int [] arr={0, 0, -1, 1, 1};
		
		
		plusMinus(arr);
	}
}