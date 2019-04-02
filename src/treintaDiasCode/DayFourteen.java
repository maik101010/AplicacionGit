class DayFourteen {
		
	static int absolutoArray(int largo){
		int [] arr = new int[largo];
		arr[0] = 8;
		arr[1] = 19; 
		arr[2] = 3; 
		arr[3] = 2; 
		arr[4] = 7; 
		int res=0;
		/*
			El menos uno se agrega para poder sumarle 1 a siguiente
		 */
		int total = 0;
		for (int i=0; i<(arr.length-1);i++) {
			int actual = arr[i];
			int siguiente = arr[i+1];
			res = Math.abs(actual-siguiente);
			arr[i+1]=res;
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		System.out.print(absolutoArray(5));
	}
}