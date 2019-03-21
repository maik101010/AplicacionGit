import java.io.*;
import java.util.*;
class DaySeven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.print("Largo arreglo: ");
        int N = scan.nextInt();
        int [] array=new int[N];
        for (int i=0; i<N; i++) {
        //	System.out.print("Numero{"+i+"} ");
        	array[i] = scan.nextInt();
        }
		for (int j=array.length-1;j>=0;j--) {
        	System.out.print(array[j]+ " ");
        }
        
	}
}