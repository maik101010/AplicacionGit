package algoritmos.treintaDiasCode;

/**
 * Integer denoting the maximum number of consecutive 1's in the binary representation of n 
 */
class DayTen {
	static String binario(int base){
		String numero = Integer.toBinaryString(base);
		return numero;		
	}

	public static void main(String[] args) {
		String res= binario(13);
		char valor='1';
		int cont =1;
		int mayor =1;
		for (int i=0; i<res.length();i++) {
			char result = res.charAt(i);
			int n = i+1;
			if (n>=res.length()) {
				break;
			}
			char siguiente = res.charAt(n);
			if (result==siguiente){
				cont++;
				if (cont>=mayor) {
					mayor = cont;
					}		
			}else{
				cont =1;	
			}
		}
		System.out.println(mayor);
		}
}