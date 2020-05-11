package algoritmos.treintaDiasCode;

class Day19 {
	static public int divisorSum(int n) {
		int suma=0;
        for(int i=1; i<=n; i++){
        	if (n%i==0) {
        		suma+=i;
        	}
        }
        return suma;
    }
	public static void main(String[] args) {
		System.out.print(divisorSum(6));
	}
	
}