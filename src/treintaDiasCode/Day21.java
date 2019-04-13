public class Day21{
	// Write your code here
    public static <E> void printArray(E[] generic){
    for(E element : generic) {
        System.out.println(element); 
    }
}
	public static void main(String[] args) {
		Object [] arr = {1, "hola", 6, "saludando"};
		printArray(arr);		
	}
	
	
}