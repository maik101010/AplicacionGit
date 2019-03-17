class Escalera {
	// Complete the staircase function below.
    static void staircase(int n) {
		String valor= "#";
		String espacio="";
		for (int i=1;i<n;i++) {
    		espacio +=" ";   	   	

    	}    	
    	String cadena=espacio;
    	int cont=0;
    	for (int i=0;i<n;i++) {
    		System.out.println(cadena+""+valor);    		
			valor+="#";
			cont++;			
			if (cont==n) {
				break;
			}
			cadena=espacio.substring(cont);
    	}
    }

	public static void main(String[] args) {
		staircase(6);
		
	}
}