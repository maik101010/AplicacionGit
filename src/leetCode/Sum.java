class Sum {
	
	public int[] twoSum(int[] nums, int target) {        
        for(int i=0; i<nums.length-1; i++){
        	for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
            }
            // if(nums[i] == target-nums[i+1]){
            //     return new int[] {i, i+1};               
            // }
        }
        throw new IllegalArgumentException("No two sum solution");     
	}

	public static void main(String[] args) {
		Sum sum = new Sum();
		int [] arr = {3,2,3};
		int [] res = sum.twoSum(arr, 6);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
}