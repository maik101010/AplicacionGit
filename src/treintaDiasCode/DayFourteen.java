class DayFourteen {
		
	static int absolutoArray(int largo){
		int [] arr = new int[largo];
		arr[0] = 1;
		arr[1] = 2; //1
		arr[2] = 4; 
		arr[3] = 2; 
		arr[4] = 7; 
		int res=0;
		/*
			El menos uno se agrega para poder sumarle 1 a siguiente
		 */		
		for (int i=0; i<(arr.length-1);i++) {
			int actual = arr[i];//1
			int siguiente = arr[i+1];//2
			res = Math.abs(actual-siguiente);//1
			arr[i+1]=res; //1
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		System.out.print(absolutoArray(5));
	}
}