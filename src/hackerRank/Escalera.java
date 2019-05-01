class Escalera {
	// Complete the staircase function below.
    static void staircase(int n) {
		String valor= "#";
		String espacio="";
		for (int i=1;i<n;i++) {
    		espacio +="**";   	   	

    	} 
    	System.out.print(espacio);
    }


/*    	String cadena=espacio;
    	for (int i=1;i<=n;i++) {
    		System.out.println(cadena+""+valor);    		
			valor+="#";
			if (i==n) {
				break;
			}
			cadena=espacio.substring(i);
    	}
    }*/

	public static void main(String[] args) {
		staircase(3);
		
	}
}