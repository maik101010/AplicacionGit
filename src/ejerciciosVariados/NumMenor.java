class NumMenor{
	public static void main(String[] args) {
		int[] arr = {55, 3, -21, 33, -1, 11, 1};     
        int menor = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< menor) {
                menor = arr[i];
            }            
        }
	}	
}